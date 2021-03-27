class Solution29 {

    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if(row == 0 )
            return new int[0];

        int col = matrix[0].length;
        int[] ret = new int[row*col];

        int index = 0; // 记录最终数组的下标，便于存放
        int left = 0, right = col-1, top = 0, bottom = row-1;
        while(true){
            for(int i = left; i <= right; ++i){
                // 从左往右走
                ret[index++] = matrix[top][i];
            }
            if(++top > bottom){
                // 到达最右边开始向下走
                // 若到达 bottom 证明所有数遍历完毕
                // 结束循环
                break;
            }
            for(int i = top; i <= bottom; ++i){
                // 从上向下走
                ret[index++] = matrix[i][right];
            }
            if(--right < left){
                // 到达最下边向左走
                // 若到达 left 则遍历完毕，结束循环
                break;
            }
            for(int i = right; i >= left; --i){
                // 从右往左走
                ret[index++] = matrix[bottom][i];
            }
            if(--bottom < top){
                // 到达最左边向上走
                // 若到达 top 则遍历完毕,结束循环
                break;
            }
            for(int i = bottom; i >= top; --i){
                // 从下往上走
                ret[index++] = matrix[i][left];
            }
            if(++left > right){
                // 到达最上边向右走
                // 若到达 right 则遍历完毕，结束循环
                break;
            }
        }
        return ret;
    }
}