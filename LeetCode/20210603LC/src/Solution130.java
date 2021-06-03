class Solution130 {
    int row, col;
    public void solve(char[][] board) {
        row = board.length;
        col = board[0].length;
        if (row == 0 || col == 0){
            return;
        }
       for (int i = 0; i < row; ++i){
           dfs(board,i,0);  // 左侧边缘
           dfs(board,i,col-1);  // 右侧边缘
       }
       for (int i = 0; i < col; ++i){
           dfs(board,0,i);  // 上侧边缘
           dfs(board,row-1,i); // 下侧边缘
       }
        // 将边缘 O 和与其相连的 O(此时已被置为'*')转换为原来的 O
        // 将被包围的 O 设置为 X
       for (int i = 0; i < row; ++i){
           for (int j = 0; j < col; ++j){
               if (board[i][j] == '*'){
                   board[i][j] = 'O';
               }else if (board[i][j] == 'O'){
                   board[i][j] = 'X';
               }
           }
       }
    }
    public void dfs(char[][] board, int i, int j){
        if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] != 'O'){
            return;
        }
        board[i][j] = '*';  // 将边缘 O 和与边缘 O 相邻的格子设为 *
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    }
}