class Solution {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || word == null || word.equals(""))
            return false;

        // 数组来存放每个数据是否使用过
        boolean[][] isVisited = new boolean[board.length][board[0].length];
        char[] c = word.toCharArray();

        // 找到 word 的起始位置
        for (int i = 0; i < board.length; ++i){
            for (int j = 0; j < board[0].length; ++j){
                if (dfs(board,i,j,isVisited,c,0))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int i, int j, boolean[][] isVisited, char[] c, int index){
        if (index == c.length - 1)
            return true;

        if (i < 0 || i >= board.length
                || j < 0 || j >= board[0].length
                || isVisited[i][j] || c[index] != board[i][j])
            return false;

        isVisited[i][j] = true;
        boolean ret = dfs(board,i-1,j,isVisited,c,index+1)
                || dfs(board,i+1,j,isVisited,c,index+1)
                || dfs(board,i,j-1,isVisited,c,index+1)
                || dfs(board,i,j+1,isVisited,c,index+1);
        isVisited[i][j] = false;
        return ret;
    }
}