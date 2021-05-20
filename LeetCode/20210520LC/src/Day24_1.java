public class Day24_1 {
    public int getMost(int[][] board) {
        // write code here
        int row = board.length;
        int col = board[0].length;
        for (int i = 1; i < row; ++i){
            board[i][0] += board[i-1][0];
        }
        for (int j = 1; j < col; ++j){
            board[0][j] += board[0][j-1];
        }

        for (int i = 1; i < row; ++i){
            for (int j = 1; j < col; ++j){
                board[i][j] += Math.max(board[i-1][j], board[i][j-1]);
            }
        }
        return board[row-1][col-1];
    }
}
