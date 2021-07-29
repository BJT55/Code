package game;

import javax.websocket.Session;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

// 通过这个类管理用户在线状态
// 为了管理这个服务器上所有的用户,只需要这一份hashMap就可以
public class OnlineUserManager {
    // 使用线程安全的 ConcurrentHashMap 代替 HashMap
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
    // 此时如果外面想使用这个实例,就直接在类内部将实例创建好,直接返回这个现成的实例
    // 这个实例通过static的引用来指向
    // static 保证了这个 new 操作只能被执行一次
    private static OnlineUserManager onlineUserManager = new OnlineUserManager();

    // 外面的代码要使用 OnlineUserManager,就通过下面代码实现
    public static OnlineUserManager getInstance(){
        return onlineUserManager;
    }
}
