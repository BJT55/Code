import java.util.*;

class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = cols-1, top = 0, bottom = rows-1;
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; ++i){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; ++i){
                res.add(matrix[i][right]);
            }
            right--;
            for(int i = right; i >= left && top <= bottom; --i){
                res.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom; i >= top && left <= right; --i){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}