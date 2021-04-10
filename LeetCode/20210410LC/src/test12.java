class Solution12 {
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || word == null){
            return false;
        }

        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] c = word.toCharArray();

        for(int i = 0; i < board.length; ++i){
            for(int j = 0; j < board[0].length; ++j){
                // 找到起始位置
                if(board[i][j] == c[0]){
                    if(dfs(board,visited,i,j,c,0))
                        return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, boolean[][] visited, int i, int j, char[] c, int index){
        if(index == c.length)
            // 单词 Word 已经走完
            return true;

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j]
                || board[i][j] != c[index]){
            return false;
        }

        visited[i][j] = true;
        boolean res = dfs(board,visited,i-1,j,c,index+1) ||
                dfs(board,visited,i+1,j,c,index+1) ||
                dfs(board,visited,i,j-1,c,index+1) ||
                dfs(board,visited,i,j+1,c,index+1);

        visited[i][j] = false;
        return res;
    }
}
