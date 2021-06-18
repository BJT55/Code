class Solution289 {
    // 周围8个方向
    private static final int[] DX = {0,0,1,-1,1,1,-1,-1};
    private static final int[] DY = {1,-1,0,0,1,-1,1,-1};

    public void gameOfLife(int[][] board) {
        if (board.length == 0){
            return;
        }

        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = 0;
                for (int k = 0; k < 8; k++) {
                    int x = i + DX[k];
                    int y = j + DY[k];
                    if (x < 0 || x >= n || y < 0 || y >= m){
                        continue;
                    }
                    count += board[x][y] & 1;
                }
                if ((board[i][j] & 1) > 0){
                    // 是活细胞
                    if (count >= 2 && count <= 3){
                        // 周围有2-3个细胞, 该细胞还是活的
                        board[i][j] = 3;  // 3--> 0011
                    }
                }else if (count == 3){
                    // 是死细胞, 但周围有3个存活的细胞, 则该细胞复活
                    board[i][j] = 2;  // 2--> 0010
                }
            }
        }
        // 最后一位去掉, 倒数第二位变为更新后的状态
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] >>= 1;
            }
        }
    }
}