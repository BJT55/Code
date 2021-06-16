public class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0, j = col-1;
        while (i < row && j >= 0 ){
            int tmp = matrix[i][j];
            if (target > tmp){
                i++;
            }else if (target < tmp){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
}
