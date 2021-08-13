public class Solution10_2 {
    public int numWays(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }

    public int numWays02(int n) {
        if (n <= 1) return 1;

        int a = 1, b = 1;
        for (int i = 2; i < n; i++){
            int tmp = (a+b)%1000000007;
            a = b;
            b = tmp;
        }
        return a;
    }
}
