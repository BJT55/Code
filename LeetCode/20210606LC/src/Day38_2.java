import java.util.Scanner;

public class Day38_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt(); // 蘑菇个数

            // 放置蘑菇
            int[][] map = new int[n+1][m+1];
            while (k != 0){
                int x = in.nextInt();
                int y = in.nextInt();
                map[x][y] = 1;
                k--;
            }

            // dp来计算dp[i][j]位置的概率
            double[][] dp = new double[n+1][m+1];
            dp[1][1] = 1.0;


            for (int i = 1; i <= n; ++i){
                for (int j = 1; j <= m; ++j){
                    // 跳过起始位置
                    if ( !(i == 1 && j == 1)){
                        dp[i][j] = dp[i-1][j] * (j == m ? 1.0 : 0.5) + dp[i][j-1] * (i == n ? 1.0 : 0.5);
                    }

                    //如果该位置有蘑菇
                    if (map[i][j] == 1){
                        dp[i][j] = 0.0;
                    }
                }
            }

            System.out.printf("%.2f\n",dp[n][m]);
        }
    }
}
