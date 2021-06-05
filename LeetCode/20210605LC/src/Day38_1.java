import java.util.Scanner;

public class Day38_1 {
    public static int count;
    public static byte[][] direct = {{-1,0},{1,0},{0,1},{0,-1}}; // 方向左右上下

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int m = in.nextInt();
            int n = in.nextInt();
            if (m*n == 0){
                continue;
            }
            // 初始化瓷砖的地图
            char[][] map = new char[m][n];
            int x = 0, y = 0; // 记录起始位置 '@'
            for (int i = 0; i < m; ++i){
                String s = in.nextLine();
                for (int j = 0; j < n; ++j){
                    map[i][j] = s.charAt(j);
                    if (map[i][j] == '@'){
                        x = i;
                        y = j;
                    }
                }
            }

            // dfs遍历输出
            count = 0;
            dfs(map,x,y,m,n);
            System.out.println(count);
        }
    }

    public static void dfs(char[][] map, int x, int y, int m, int n){
        if (map[x][y] == '#'){
            // 如果当前位置是 '#' 白砖,则直接返回
            return;
        }
        // 否则为黑砖, count++
        count++;
        // 走过后修改为白砖, 使其被标记不再被遍历
        map[x][y] = '#';

        // 遍历该砖向四个方向走
        for (int i = 0; i < 4; ++i){
            int xx = x + direct[i][0];
            int yy = y + direct[i][1];
            if (xx >= 0 && xx < m && yy >= 0 && yy < n){
                dfs(map,xx,yy,m,n);
            }
        }
    }
}
