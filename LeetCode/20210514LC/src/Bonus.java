public class Bonus {
    public int getMost(int[][] board) {
        // write code here
        int row = board.length;
        int col = board[0].length;
        int[][] dp = new int[row][row];
        dp[0][0] = board[0][0];
        for (int i = 1; i < row; ++i){
            dp[0][i] = dp[0][i-1] + board[0][i];
        }

        for (int i = 1; i < col; ++i){
            dp[i][0] = dp[i-1][0] + board[i][0];
        }

        for (int i = 1; i < row; ++i){
            for (int j = 1; j < col; ++j){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + board[i][j];
            }
        }
        return dp[row-1][col-1];
    }
}