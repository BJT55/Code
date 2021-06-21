import java.util.*;

public class HJ16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt(); // 总钱数
            int m = in.nextInt();  // 希望购买物品的个数
            int[] p = new int[m];
            int[] v = new int[m];
            int[] q = new int[m];
            for(int i = 0; i < m; ++i){
                p[i] = in.nextInt();
                v[i] = in.nextInt() * p[i];
                q[i] = in.nextInt();
            }
            System.out.println(getMaxValue(v,p,q,m,n));
        }
    }
    public static int getMaxValue(int[] val, int[] weight, int[] q, int n, int w){
        int[][] dp = new int[n+1][w+1];
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= w; ++j){
                if(q[i-1] == 0){  // 主件
                    if(weight[i-1] <= j){  // 用j钱去买i建商品所获取的最大价值
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]] + val[i-1]);
                    }
                }
                else {  // 附件
                    if(weight[i-1] + weight[q[i-1]] <= j){
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]] + val[i-1]);
                    }
                }
            }
        }
        return dp[n][w];
    }
}
