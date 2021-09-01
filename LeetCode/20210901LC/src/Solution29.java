public class Solution29 {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if(row == 0) return new int[0];
        int col = matrix[0].length;

        int[] res = new int[row*col];
        int index = 0;
        int left = 0, right = col-1, top = 0, bottom = row-1;

        while (left <= right && top <= bottom){
            for (int j = left; j <= right; j++){
                res[index++] = matrix[top][j];
            }
            if (++top > bottom){
                break;
            }
            for (int i = top; i <= bottom; i++){
                res[index++] = matrix[i][right];
            }
            if (--right < left){
                break;
            }
            for (int j = right; j >= left; j--){
                res[index++] = matrix[bottom][j];
            }
            if (--bottom < top){
                break;
            }
            for (int i = bottom; i >= top; i--){
                res[index++] = matrix[i][left];
            }
            if (++left > right){
                break;
            }
        }
        return res;
    }
}