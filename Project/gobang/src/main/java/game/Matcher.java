package game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.Session;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Matcher {
    private Gson gson = new GsonBuilder().create();

    // mathQueue队列放置待匹配的请求,BlockingQueue阻塞队列
    // "线程安全" 问题
    private BlockingQueue<Request> matchQueue = new LinkedBlockingQueue<>();
    private static Matcher matcher = new Matcher();
    public static Matcher getInstance() {
        return matcher;
    }

    // 添加
    public void addMatchQueue(Request request) throws InterruptedException {
        // matchQueue.offer(request); // offer没有阻塞功能,put有
        matchQueue.put(request);
    }

    // 处理请求
    private void handlerMatch() throws InterruptedException, IOException {
        // 就只要队列中存在两个元素, 就给配成一对
        // 1. 从队列中取出两个元素
        // take 阻塞功能
        Request player1 = matchQueue.take();
        Request player2 = matchQueue.take();
        System.out.println("匹配到两个玩家: " + player1.getUserId() + ", " + player2.getUserId());
        // 2. 获取到当前玩家的 Session 对象.
        Session session1 = OnlineUserManager.getInstance()
                .getSession(player1.getUserId());
        Session session2 = OnlineUserManager.getInstance()
                .getSession(player2.getUserId());
        if (session1 == null) {
            // 玩家 1 已经掉线. 就把玩家 2 的匹配请求给重新插入到匹配队列中
            matchQueue.put(player2);
            return;
        }
        if (session2 == null) {
            // 玩家 2 已经掉线, 就把玩家 1 的匹配请求给重新插入到匹配队列中
            matchQueue.put(player1);
            return;
        }
        // 3. 如果两个玩家都没掉线, 就可以把两个玩家放到同一个房间中
        //    进行对战了
        //    此处要实现的逻辑就是创建一个房间, 把玩家放进去.
        Room room = new Room();
        room.setUserId1(player1.getUserId());
        room.setUserId2(player2.getUserId());
        //    再把房间放到 "房间管理器" 中
        RoomManager.getInstance().addRoom(room);
        // 4. 给两个玩家反馈 "匹配成功" 消息
        //  1) 给玩家1返回
        MatcherResponse response1 = new MatcherResponse();
        response1.setRoomId(room.getRoomId());
        response1.setWhite(true);
        response1.setOtherUserId(player2.getUserId());
        String respString1 = gson.toJson(response1);
        session1.getBasicRemote().sendText(respString1);
        //  2) 给玩家2返回
        MatcherResponse response2 = new MatcherResponse();
        response2.setRoomId(room.getRoomId());
        response2.setWhite(false);
        response2.setOtherUserId(player1.getUserId());
        String respString2 = gson.toJson(response2);
        session2.getBasicRemote().sendText(respString2);
    }

    // 单例模式
    private Matcher() {
        Thread t = new Thread() {
            @Override
            public void run() {
                // 持续不断的进行处理队列中的请求
                while (true) {
                    try {
                        handlerMatch();
                    } catch (InterruptedException | IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }
}
