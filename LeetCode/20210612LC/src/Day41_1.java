import java.util.Scanner;
// 五子棋
public class Day41_1 {
    static int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            char[][] map = new char[20][20];
            for (int i = 0; i < 20; i++) {
                map[i] = in.next().toCharArray();
            }
            if (check(map)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private static boolean check(char[][] map) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (map[i][j] == '*' || map[i][j] == '+'){
                    if (count(map,map[i][j],i,j) >= 5){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int count(char[][] map, char c, int x, int y) {
        int[][][] direction = {{{-1, 0}, {1, 0}}, //上下
                {{0, -1}, {0, 1}},  //左右
                {{-1, -1}, {1, 1}},  // 左下,右上
                {{-1, 1}, {1, -1}}};  // 左上,右下

        int maxCount = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 2; j++) {
                int xx = x;
                int yy = y;
                while (xx >= 0 && xx < 20 && yy >= 0 && yy < 20 && map[xx][yy] == c){
                    count++;
                    xx += direction[i][j][0];
                    yy += direction[i][j][1];
                }
            }
            maxCount = Math.max(maxCount,count);
        }

        return maxCount-1;
    }
}
