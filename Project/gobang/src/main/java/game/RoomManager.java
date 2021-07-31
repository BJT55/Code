package game;

import java.util.concurrent.ConcurrentHashMap;

// 通过这个类来管理多个房间对象
public class RoomManager {
    // 使用 hashMap 来存储房间信息
    // key 是 roomId, value 是 room 对象
    private ConcurrentHashMap<String,Room> rooms = new ConcurrentHashMap<>();

    // 把房间放入房间管理器中
    public void addRoom(Room room){
        rooms.put(room.getRoomId(),room);
    }

    // 把房间从房间管理器中删除
    public void removeRoom(String roomId){
        rooms.remove(roomId);
    }

    // 根据房间 id 查找对应的房间
    public Room getRoom(String roomId){
        return rooms.get(roomId);
    }

    // 变为单例类
    private RoomManager(){}
    private static RoomManager roomManager = new RoomManager();
    public static RoomManager getInstance(){
        return roomManager;
    }

}
