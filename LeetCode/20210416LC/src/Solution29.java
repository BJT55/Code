class Solution29 {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if(row == 0)
            return new int[0];
        int col = matrix[0].length;

        int index = 0;
        int[] res = new int[row*col];
        int left = 0, right = col-1, top = 0, bottom = row-1;
        while(true){
            // 从左向右走
            for(int i = left; i <= right; ++i){
                res[index++] = matrix[top][i];
            }
            // 判断是否能够向下走
            if(++top > bottom){
                break;
            }
            // 从上向下走
            for(int i = top; i <= bottom; ++i){
                res[index++] = matrix[i][right];
            }
            // 判断是否能够向左走
            if(--right < left){
                break;
            }
            // 从右向左走
            for(int i = right; i >= left; --i){
                res[index++] = matrix[bottom][i];
            }
            // 判断是否能够向上走
            if(--bottom < top){
                break;
            }
            // 从下向上走
            for(int i = bottom; i >= top; --i){
                res[index++] = matrix[i][left];
            }
            // 判断是否能够向右走
            if(++left > right){
                break;
            }
        }
        return res;
    }
}