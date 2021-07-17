public class JZ13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(visited,m,n,k,0,0);
    }

    private int dfs(boolean[][] visited, int m, int n, int k, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || (i/10+i%10+j/10+j%10) > k || visited[i][j] ){
            return 0;
        }
        visited[i][j] = true;
        return dfs(visited, m, n, k, i+1, j) +
                dfs(visited, m, n, k, i-1, j) +
                dfs(visited, m, n, k, i, j+1) +
                dfs(visited, m, n, k, i, j-1) + 1;
    }
}
