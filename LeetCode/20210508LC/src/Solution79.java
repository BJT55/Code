class Solution79 {
    public boolean exist(char[][] board, String word) {
        int row = board.length, col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                boolean flag = check(board,visited,i,j,word,0);
                if (flag){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board, boolean[][] visited, int i, int j, String word, int index){
        if (board[i][j] != word.charAt(index)){
            return false;
        }else if (index == word.length()-1){
            return true;
        }

        visited[i][j] = true;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        boolean res = false;
        for (int[] dir : directions){
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI >= 0 && newI < board.length && newJ >= 0 && newJ < board[0].length){
                if (!visited[newI][newJ]){
                    boolean flag = check(board,visited,newI,newJ,word,index+1);
                    if (flag){
                        res = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return res;
    }
}