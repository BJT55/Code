class Solution73 {
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return;
        boolean rowFlag = false, colFlag = false;
        int row = matrix.length, col = matrix[0].length;
        // 首行是否有 0
        for (int i = 0; i < col; ++i){
            if (matrix[0][i] == 0){
                rowFlag = true;
                break;
            }
        }
        // 首列是否有 0
        for (int i = 0; i < row; ++i){
            if (matrix[i][0] == 0){
                colFlag = true;
                break;
            }
        }
        // 遍历除第一行第一列外的元素,若为 0, 则对应的第一行第一列位置为 0
        for (int i = 1; i < row; ++i){
            for (int j = 1; j < col; ++j){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 遍历除第一行第一列外的元素,若元素所在的第一行第一列为 0, 则该位置被设为 0
        for (int i = 1; i < row; ++i){
            for (int j = 1; j < col; ++j){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        // 若首行首列有 0, 则首行首列元素都设为 0
        if (rowFlag){
            for (int i = 0; i < row; ++i){
                matrix[i][0] = 0;
            }
        }
        if (colFlag){
            for (int i = 0; i < col; ++i){
                matrix[0][i] = 0;
            }
        }
    }
}