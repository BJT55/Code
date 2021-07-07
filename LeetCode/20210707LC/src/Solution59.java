public class Solution59 {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] arr = new int[n][n];
        int left = 0, right = n-1, top = 0, bottom = n-1;
        while (left <= right && top <= bottom){
            for (int col = left; col <= right; ++col){
                arr[top][col] = num;
                num++;
            }
            for (int row = top+1; row <= bottom; row++){
                arr[top][right] = num;
                num++;
            }
            if (left < right && top < bottom){
                for (int col = right-1; col > left; col--){
                    arr[bottom][col] = num;
                    num++;
                }
                for (int row = bottom; row > top; row--){
                    arr[row][left] = num;
                    num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return arr;
    }
}
