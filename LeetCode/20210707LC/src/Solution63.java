public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[] dp = new int[col];
        dp[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                if (obstacleGrid[i][j] == 1){
                    dp[j] = 0;
                    continue;
                }
                if (j - 1 > 0 && obstacleGrid[i][j-1] == 0){
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[col-1];
    }
}
