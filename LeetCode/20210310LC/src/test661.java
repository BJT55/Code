public class test661 {
}

class Solution661 {
    public int[][] imageSmoother(int[][] M) {
        int r = M.length, c = M[0].length;
        int[][] ans = new int[r][c];

        for (int i = 0; i < r; ++i){
            for (int j = 0; j < c; ++j){
                int count = 0;
                for (int ni = i - 1; ni <= i+1; ++ni){
                    for (int nj = j - 1; nj <= j+1; ++nj){
                        if (0 <= ni && ni < r && 0 <= nj && nj < c){
                            ans[i][j] += M[ni][nj];
                            count++;
                        }
                    }
                }
                ans[i][j] /= count;
            }
        }
        return ans;
    }
}
