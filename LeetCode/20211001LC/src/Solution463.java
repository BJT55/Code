public class Solution463 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == 1){
                    int count = 0;
                    for (int k = 0; k < 4; k++){
                        int xx = i + dx[k];
                        int yy = j + dy[k];
                        if (xx < 0 || xx >= row || yy < 0 || yy >= col || grid[xx][yy] == 0){
                            count++;
                        }
                    }
                    res += count;
                }
            }
        }
        return res;
    }
}
