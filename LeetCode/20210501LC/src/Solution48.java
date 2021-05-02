class Solution48 {
    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // 上下翻转
        for(int i = 0; i < row/2; ++i){
            for(int j = 0; j < col; ++j){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[row-i-1][j];
                matrix[row-i-1][j] = tmp;
            }
        }
        // 对角线翻转
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}