class Solution60 {
    public double[] dicesProbability(int n) {
        int[][] dp = new int[n+1][6*n+1];
        // 从初始化第一个骰子每个点数出现的次数
        for(int i = 1; i <= 6; ++i){
            dp[1][i] = 1;
        }

        for(int i = 2; i <= n; ++i){
            // 第 i 个骰子
            for(int j = i; j <= 6 * i; ++j){
                // i 个骰子的点数和范围在 i ~ 6*i
                for(int k = 1; k <= 6 && k < j; ++k){
                    // 第 i 个骰子投完后点数总和为 j
                    // 此时的次数为 前一个骰子投完总点数为 j-k 时加上第 i 个骰子点数为 k 时的次数
                    dp[i][j] += dp[i-1][j-k];
                }
            }
        }

        double[] res = new double[6*n - n + 1];
        for(int i = n; i <= 6*n; i++){
            res[i-n] = (double)(dp[n][i]/Math.pow(6,n));
        }
        return res;
    }
}