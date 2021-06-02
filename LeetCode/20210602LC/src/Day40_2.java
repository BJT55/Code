import java.util.Scanner;

public class Day40_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; ++i){
                height[i] = in.nextInt();
            }
            System.out.println(help(height,n));
        }
    }
    public static int help(int[] height, int n){
        if (height == null || n <= 0 || height.length != n){
            return 0;
        }
        // dp[i]代表以 i 结尾的最长递增子序列的长度
        int[] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < n; ++i){
            dp[i] = 1;
            for (int j = i-1; j >= 0; --j){
                if (height[i] > height[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            if (max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}
