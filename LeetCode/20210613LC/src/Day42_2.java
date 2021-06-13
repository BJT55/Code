import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 走迷宫
public class Day42_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String[] map = new String[10];
            for (int i = 0; i < 10; i++) {
                map[i] = in.nextLine();
            }
            System.out.println(bfs(map,10,10));
        }
    }

    private static int bfs(String[] map, int m, int n) {
        int[][] direction = {{0,1},{0,-1},{-1,0},{1,0}};  // 定义方向上下左右
        Queue<Position> queue = new LinkedList<>();

        // 标记某个位置是否遍历过
        boolean[][] flag = new boolean[m][n];
        Position start = new Position(0,1,0);  // 入口
        Position out = new Position(9,8,0);  // 出口
        queue.offer(start);
        while (!queue.isEmpty()){
            Position cur = queue.poll();
            // 遍历当前位置
            flag[cur.x][cur.y] = true;
            // 达到出口,则直接返回level
            if (cur.x == out.x && cur.y == out.y){
                return cur.level;
            }

            Position next = new Position();
            for (int i = 0; i < 4; i++) {
                next.x = cur.x + direction[i][0];
                next.y = cur.y + direction[i][1];

                if (next.x >= 0 && next.x < m &&
                    next.y >= 0 && next.y < n &&
                    map[next.x].charAt(next.y) == '.' &&
                    !flag[next.x][next.y]){
                    next.level = cur.level + 1;
                    queue.offer(new Position(next.x,next.y,next.level));
                }
            }
        }
        return 0;
    }
}

class Position{
    public int x;
    public int y;
    public int level;

    public Position(int x, int y, int level){
        this.x = x;
        this.y = y;
        this.level = level;
    }
    public Position(){}
}
