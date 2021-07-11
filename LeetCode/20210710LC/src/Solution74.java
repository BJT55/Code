public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0){
            return false;
        }
        int col = matrix[0].length;
        int i = 0, j = col-1;
        while(i < row && j >= 0){
            if(target > matrix[i][j]){
                i++;
            }else if(target < matrix[i][j]){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
}
