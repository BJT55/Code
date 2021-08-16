public class Solution29 {
    public int[] spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) return new int[0];
        int cols = matrix[0].length;
        int[] res = new int[rows*cols];

        int left = 0, right = cols-1, up = 0, bottom = rows-1;
        int idx = 0;
        while (true){
            // 向右走
            for (int j = left; j <= right; j++) {
                res[idx++] = matrix[up][j];
            }
            if (++up > bottom){
                break;
            }
            // 向下走
            for (int i = up; i <= bottom; i++) {
                res[idx++] = matrix[i][right];
            }
            if (--right < left){
                break;
            }
            // 向左走
            for (int j = right; j >= left; j--){
                res[idx++] = matrix[bottom][j];
            }
            if (--bottom < up){
                break;
            }
            // 向上走
            for (int i = bottom; i >= up; i--){
                res[idx++] = matrix[i][left];
            }
            if (++left > right){
                break;
            }
        }
        return res;
    }
}
