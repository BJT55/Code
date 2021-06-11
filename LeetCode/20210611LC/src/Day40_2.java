
// 最长上升子序列
import java.util.*;
public class Day40_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] height = new int[n];
            for(int i = 0; i < n; ++i){
                height[i] = in.nextInt();
            }
            System.out.println(LIS(height,n));
        }
    }
    public static int LIS(int[] height, int n){
        int res = 1;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i = 1; i < n; ++i){
            for (int j = 0; j < i; ++j) {
                if(height[i] > height[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}