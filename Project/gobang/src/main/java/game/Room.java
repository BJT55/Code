package game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.Session;
import java.io.IOException;
import java.util.UUID;

// 通过这个类来表示一个房间,一个房间对应一局对战
public class Room {
    private Gson gson = new GsonBuilder().create();
    private static final int MAX_ROW = 15;
    private static final int MAX_COL = 15;

    // 需要保证房间 id 的唯一性,使用 UUID 来作为房间 id,保证每个房间编号不重复
    private String roomId;
    // 两个对局玩家
    private int userId1;
    private int userId2;
    // 游戏状态,就是棋盘上落子情况
    // 约定 玩家1 的棋子用 1 来表示, 玩家2 的棋子用 2 来表示
    // 未落子的空白位置用 0 来表示,落子用 1 来表示
    private int[][] chessBoard = new int[MAX_ROW][MAX_COL];

    public Room(){
        this.roomId = UUID.randomUUID().toString();
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    public String getRoomId() {
        return roomId;
    }
    // 实现落子过程
    public void putChess(Request request) throws IOException {
//        System.out.println("当前房间号:"+roomId);
        // 1. 将棋子放入棋盘中
        int chess = request.getUserId() == userId1 ? 1 : 2;
        int row = request.getRow();
        int col = request.getCol();
        if (chessBoard[row][col] != 0){
            // 玩家落子位置已经有棋子了
            System.out.println("落子位置有误!" + request);
            return;
        }
        chessBoard[row][col] = chess;
        // 打印棋盘便于测试
//        printChessBoard();

        // 2. 检查游戏是否结束 , 验证是否能够连成 5 个棋子
        //    返回值为 0 打平
        int winner = checkWinner(chess,row,col);

        // 3. 把游戏情况的响应返回给所有玩家, 在哪下了棋, 同时判断游戏是否结束
        //    a) 构造一个响应对象
        PutChessResponse response = new PutChessResponse();
        response.setUserId(request.getUserId());
        response.setRow(row);
        response.setCol(col);
        response.setWinner(winner);
        //    b) 根据玩家的 id 来获取玩家的 Session对象
        Session session1 = OnlineUserManager.getInstance().getSession(userId1);
        Session session2 = OnlineUserManager.getInstance().getSession(userId2);
        //    c) 判断玩家是否有掉线情况, 若有玩家掉线, 则给另一个玩家发送响应 "您获胜了"
        if (session1 == null && session2 == null){
            // 如果玩家1 和 玩家2 都掉线, 则直接结束这个方法, 并销毁当前房间
            // 若不删除该房间, 则会一直存在, 最终导致内存泄漏情况
            RoomManager.getInstance().removeRoom(roomId);
            System.out.println("两个玩家都掉线了..."+roomId);
            return;
        }
        if (session1 == null){
            // 玩家1 掉线, 则直接判定 玩家2 获胜
            response.setWinner(userId2);
        }
        if (session2 == null){
            // 玩家2 掉线, 则直接判定 玩家1 获胜
            response.setWinner(userId1);
        }
        //    d) 把当前构造好的响应对象转换为JSON字符串, 返回给玩家
        String responseString = gson.toJson(response);
        if (session1 != null) {
            session1.getBasicRemote().sendText(responseString);
        }
        if (session2 != null) {
            session2.getBasicRemote().sendText(responseString);
        }

        // 4. 如果当前游戏胜负已分, 则销毁这个房间
        if (winner != 0){
            RoomManager.getInstance().removeRoom(roomId);
            System.out.println("游戏结束,销毁房间:" + roomId);
        }
    }

    private int checkWinner(int chess, int row, int col) {
        // done 表示当前是否已经分出胜负了
        // 如果 done 为 true, 表示已经找到了五子连珠的情况
        boolean done = false;
        // 1. 检查一行的五子情况
        for (int c = col-4; c <= col; c++){
            if (c < 0 || c + 4 >= MAX_COL){
                continue;
            }
            if (chessBoard[row][c] == chess
                    && chessBoard[row][c+1] == chess
                    && chessBoard[row][c+2] == chess
                    && chessBoard[row][c+3] == chess
                    && chessBoard[row][c+4] == chess) {
                done = true;
            }
        }
        // 2. 检查一列的五子情况
        for (int r = row-4; r <= row; r++){
            if (r < 0 || r + 4 >= MAX_ROW){
                continue;
            }
            if (chessBoard[row][r] == chess
                && chessBoard[row][r+1] == chess
                && chessBoard[row][r+2] == chess
                && chessBoard[row][r+3] == chess
                && chessBoard[row][r+4] == chess){
                done = true;
            }
        }
        // 3. 检查左对角线的五种情况
        for (int r = row-4, c = col-4; r <= row && c <= col; r++,c++){
            if (r < 0 || r+4 >= MAX_ROW || c < 0 || c+4 >= MAX_COL){
                continue;
            }
            if (chessBoard[r][c] == chess
                && chessBoard[r+1][c+1] == chess
                && chessBoard[r+2][c+2] == chess
                && chessBoard[r+3][c+4] == chess
                && chessBoard[r+4][c+4] == chess){
                done = true;
            }
        }
        // 4. 检查右对角线的五种情况
        for (int r = row-4, c = col+4; r <= row && c >= col; r++,c--){
            if (r < 0 || r+4 >= MAX_ROW || c-4 < 0 || c >= MAX_COL){
                continue;
            }
            if (chessBoard[r][c] == chess
                    && chessBoard[r+1][c-1] == chess
                    && chessBoard[r+2][c-2] == chess
                    && chessBoard[r+3][c-4] == chess
                    && chessBoard[r+4][c-4] == chess){
                done = true;
            }
            if (!done){
                return 0;
            }
            return chess == 1 ? userId1 : userId2;
        }
        return 0;
    }

/*    private void printChessBoard() {
        // 实现打印棋盘, 就可以在服务器上看到当前棋面上的内容
        System.out.println("=================================================");
        for (int r = 0; r < MAX_ROW; ++r){
            for (int c = 0; c < MAX_COL; ++c){
                System.out.print(chessBoard[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("=================================================");
    }*/
}
