package game;

import javax.websocket.Session;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

// 管理用户在线状态
public class OnlineUserManager {
    // 使用线程安全的 ConcurrentHashMap
    private ConcurrentHashMap<Integer, Session> users = new ConcurrentHashMap<>();

    // 用户上线
    public void online(int userId, Session session){
        users.put(userId,session);
    }
    // 用户下线
    public void offline(int userId){
        users.remove(userId);
    }

    // 根据用户id获取session对象
    public Session getSession (int userId){
        return users.get(userId);
    }

    private OnlineUserManager(){}

    private static OnlineUserManager onlineUserManager = new OnlineUserManager();

    public static OnlineUserManager getInstance(){
        return onlineUserManager;
    }
}
