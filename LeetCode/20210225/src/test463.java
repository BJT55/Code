public class test463 {
    public static void main(String[] args) {
        Solution463 s = new Solution463();
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(s.islandPerimeter(grid));
    }
}

class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int num = 0; // 记录岛屿的数目
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[i].length; ++j){
                if(grid[i][j] == 1){
                    num++;
                }
            }
        }
        int count = 0; //记录相邻岛屿的数目
        // 对于相邻岛屿来说，每两个相邻，则边数-1
        // 横排相邻个数：
        for(int i = 0; i < grid.length; ++i){
            for(int j = 1; j < grid[i].length; ++j){
                if(grid[i][j - 1] == 1 && grid[i][j] == 1){
                    count++;
                }
            }
        }
        // 纵排相邻个数：
        for(int i = 1; i < grid.length; ++i){
            for(int j = 0; j < grid[i].length; ++j){
                if(grid[i-1][j] == 1 && grid[i][j] == 1){
                    count++;
                }
            }
        }
        // 所有相邻的网格数都计算了两遍
        return num * 4 - count * 2;
    }
}