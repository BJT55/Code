public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        if (row < 1){
            return 0;
        }
        int col = matrix[0].length;
        int res = 0;
        int maxEdge = 0;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1'){
                    if (i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]) + 1;
                    }
                }
                maxEdge = Math.max(maxEdge,dp[i][j]);
            }
        }
        return maxEdge * maxEdge;
    }
}
