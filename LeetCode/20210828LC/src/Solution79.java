public class Solution79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (checkWord(board,i,j,0,word,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkWord(char[][] board, int i, int j, int index, String word, boolean[][] visited) {
        if (index == word.length()){
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || visited[i][j] || board[i][j] != word.charAt(index)){
            return false;
        }


        visited[i][j] = true;
        boolean flag = checkWord(board, i+1, j, index+1, word, visited) ||
                checkWord(board, i-1, j, index+1, word, visited) ||
                checkWord(board, i, j+1, index+1, word, visited) ||
                checkWord(board, i, j-1, index+1, word, visited);
        visited[i][j] = false;
        return flag;
    }

}
