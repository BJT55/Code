class Solution70 {
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        int i = 2;
        while(i < n ){
            dp[i] = dp[i-1]+dp[i-2];
            i++;
        }
        return dp[n-1];
    }
}