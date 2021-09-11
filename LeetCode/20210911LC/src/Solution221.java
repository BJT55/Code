public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        if (row < 1) return 0;
        int col = matrix[0].length;
        int max = 0;
        int[] pre = new int[col+1];
        int[] cur = new int[col+1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (matrix[i-1][j-1] == '1'){
                    cur[j] = 1 + Math.min(pre[j-1], Math.min(pre[j],cur[j-1]));
                    max = Math.max(max, cur[j]);
                }
                pre[j-1] = cur[j-1];
                cur[j-1] = 0;
            }
            pre[col] = cur[col];
            cur[col] = 0;
        }
        return max*max;
    }
}
