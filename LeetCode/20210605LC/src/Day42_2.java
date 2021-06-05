import java.util.Arrays;
import java.util.Scanner;

public class Day42_2 {
    static int[][] fd = {{1,0},{0,1},{-1,0},{0,-1}};  // 上下左右
    static char[][] c = new char[10][10];
    static int[][] num = new int[10][10];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            for (int i = 0; i < 10; ++i){
                Arrays.fill(num[i],Integer.MAX_VALUE);
            }

            for (int i = 0; i < 10; ++i){
                c[i] = in.next().toCharArray();
            }

            num[0][1] = 0;  // 起始点设为 0
            dfs(0,1);
            System.out.println(num[9][8]);
        }
    }

    public static void dfs(int x, int y){
        int xx, yy;
        for (int i = 0; i < 4; ++i){
            xx = x + fd[i][0];
            yy = y + fd[i][1];
            if (xx >= 0 && xx < 10 && yy >= 0 && yy < 10 && c[xx][yy] == '.'){
                // 坐标没有越界, 可以继续走
                if (num[xx][yy] > num[x][y] + 1){
                    num[xx][yy] = num[x][y] + 1;
                    dfs(xx,yy);
                }
            }
        }
    }
}
