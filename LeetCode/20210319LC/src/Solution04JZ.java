class Solution04JZ {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0)
            return false;
        int col = matrix[0].length;

        int i = 0, j = col-1, index;
        while(i < row && j >= 0){
            index = matrix[i][j];
            if(target < index){
                j--;
            }
            else if(target == index){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}