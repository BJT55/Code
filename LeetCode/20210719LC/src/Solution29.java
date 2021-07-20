public class Solution29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }

        int row = matrix.length, col = matrix[0].length;
        int[] res = new int[row * col];
        int index = 0;
        int left = 0, right = col-1, top = 0, bottom = row-1;
        while (left <= right && top <= bottom){
            for (int j = left; j <= right; j++){
                res[index++] = matrix[top][j];
            }
            for (int i = top+1; i <= bottom; ++i){
                res[index++] = matrix[i][right];
            }

            if (left < right && top < bottom){
                for (int j = right-1; j > left; --j){
                    res[index++] = matrix[bottom][j];
                }
                for (int i = bottom; i > top; --i){
                    res[index++] = matrix[i][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}
