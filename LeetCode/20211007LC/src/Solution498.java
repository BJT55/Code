public class Solution498 {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0){
            return new int[]{};
        }

        int r = 0, c = 0;
        int row = mat.length, col = mat[0].length;
        int[] res = new int[row*col];

        for (int i = 0; i < res.length; i++) {
            res[i] = mat[r][c];
            // r+c 为遍历的层数,奇数向下,偶数向上
            if ((r+c)%2 == 0){
                if (c == col-1){
                    r++;
                }else if (r == 0){
                    c++;
                }else {
                    r--;
                    c++;
                }
            }else {
                if (r == row-1){
                    c++;
                }else if (c == 0){
                    r++;
                }else {
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}
