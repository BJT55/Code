public class Solution59_2 {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int left = 0, right = n-1, top = 0, bottom = n-1;
        int[][] arr = new int[n][n];
        while (num < n*n){
            for (int j = left; j < right; ++j){
                arr[top][j] = num++;
            }

            for (int i = top; i < bottom; ++i){
                arr[i][right] = num++;
            }

            for (int j = right; j > left; --j){
                arr[bottom][j] = num++;
            }

            for (int i = bottom; i > top; --i){
                arr[i][left] = num++;
            }

            left++;
            right--;
            top++;
            bottom--;
        }
        if(n%2 == 1){
            arr[left][top] = num;
        }
        return arr;
    }
}
