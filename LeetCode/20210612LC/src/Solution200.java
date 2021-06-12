class Solution200 {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] ==  '1') {
                    landCount(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }
    public void landCount(char[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';  // 将连通的岛屿 ('1') 置为 ('0')
        landCount(grid,i+1,j);
        landCount(grid,i,j+1);
        landCount(grid,i-1,j);
        landCount(grid,i,j-1);
    }
}