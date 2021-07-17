public class JZ12 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }

        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] c = word.toCharArray();

        for(int i = 0; i < board.length; ++i){
            for(int j = 0; j < board[0].length; ++j){
                if(bfs(board,i,j,visited,c,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean bfs(char[][] board, int i, int j, boolean[][] visited, char[] c, int index){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != c[index] || visited[i][j]){
            return false;
        }

        if(index == c.length-1){
            return true;
        }

        visited[i][j] = true;
        boolean res = bfs(board,i+1,j,visited,c,index+1) ||
                bfs(board,i-1,j,visited,c,index+1) ||
                bfs(board,i,j+1,visited,c,index+1) ||
                bfs(board,i,j-1,visited,c,index+1);

        visited[i][j] = false;
        return res;
    }
}
