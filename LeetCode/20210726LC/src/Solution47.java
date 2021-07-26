public class Solution47 {
    public int maxValue(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[][] dp = new int[row+1][col+1];
        for (int i = 1; i <= row; ++i){
            for (int j = 1; j <= col; ++j){
                dp[i][j] = grid[i-1][j-1] + Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[row][col];
    }


    public int maxValue_2(int[][] grid) {
        int row = grid.length, col = grid[0].length;

        // 初始化第一行
        for (int j = 1; j < col; j++) {
            grid[0][j] += grid[0][j-1];
        }
        // 初始化第一列
        for (int i = 1; i < row; i++) {
            grid[i][0] += grid[i-1][0];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                grid[i][j] += Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[row-1][col-1];
    }
}
