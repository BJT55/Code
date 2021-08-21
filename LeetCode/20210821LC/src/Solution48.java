public class Solution48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 先上下交换
        for (int i = 0; i < n/2; i++){
            for (int j = 0; j < n; j++) {
                swap(matrix,i,j,n-i-1,j);
            }
        }
        // 再对角线交换
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i != j){
                    swap(matrix,i,j,j,i);
                }
            }
        }
    }

    private void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int tmp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = tmp;
    }
}
