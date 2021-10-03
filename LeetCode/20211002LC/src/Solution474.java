public class Solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][][] dp = new int[len+1][m+1][n+1];
        for (int i = 1; i <= len; i++) {
            int[] zeroOnes = getZeroOnes(strs[i-1]);
            int zeros = zeroOnes[0], ones = zeroOnes[1];
            for (int j = 0; j <= m; j++){
                for (int k = 0; k <= n; k++){
                    dp[i][j][k] = dp[i-1][j][k];
                    if (j >= zeros && k >= ones){
                        dp[i][j][k] = Math.max(dp[i][j][k],dp[i-1][j-zeros][k-ones]+1);
                    }
                }
            }
        }
        return dp[len][m][n];
    }

    private int[] getZeroOnes(String str) {
        int[] zeroOnes = new int[2];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            zeroOnes[str.charAt(i)-'0']++;
        }
        return zeroOnes;
    }
}
