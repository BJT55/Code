package game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

// 通过这个类,借助 websocket 和前端进行交互
@ServerEndpoint("/game/{userId}")
public class GameAPI {
    private int userId;
    private Gson gson = new GsonBuilder().create();

    @OnOpen
    public void onOpen(@PathParam("userId") String userId,Session session) throws IOException {
        this.userId = Integer.parseInt(userId);
        System.out.println("连接建立!" + this.userId);

        if (OnlineUserManager.getInstance().getSession(this.userId) == null){
            // 当前用户未登录
            OnlineUserManager.getInstance().online(this.userId,session);
        }else {
            // 当前用户已经登录过了
            session.getBasicRemote().sendText("duplicationLogin");
        }
    }
    @OnClose
    public void onClose(){
        System.out.println("连接关闭! userId:" + this.userId);

        OnlineUserManager.getInstance().offline(this.userId);
    }
    @OnError
    public void onError(Session session,Throwable error){
        System.out.println("连接异常! userId:" + this.userId);
        error.printStackTrace();

        OnlineUserManager.getInstance().offline(this.userId);
    }
    @OnMessage
    public void onMessage(String message, Session session) throws InterruptedException, IOException {
        System.out.println("收到消息! Message:" + message + "userId: " + this.userId);

        // message 转换为 json 对象
        Request request = gson.fromJson(message,Request.class);
        if ("startMatch".equals(request.getType())){
            // 将当前用户的匹配请求插入到当前匹配的队列中去
            Matcher.getInstance().addMatchQueue(request);
        }else if ("putChess".equals(request.getType())){
            // 当前要执行 "落子" 的逻辑
            // 1. 先根据请求对象, 获取当前请求所属的房间id, 进一步找到房间对象
           Room room = RoomManager.getInstance().getRoom(request.getRoomId());
           // 2. 进行具体的落子操作
            room.putChess(request);
        }else {
            System.out.println("当前请求类型错误! type:" + request.getType());
        }
    }
}
