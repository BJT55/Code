import java.util.ArrayList;
import java.util.List;

public class JZ19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return res;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int numbers = row*col;
        int left = 0, right = col-1, top = 0, bottom = row-1;
        while (res.size() < numbers) {
            for (int j = left; j <= right; j++) {
                res.add(matrix[top][j]);
            }
            if(res.size() == numbers){
                break;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if(res.size() == numbers){
                break;
            }
            right--;
            for (int j = right; j >= left; --j){
                res.add(matrix[bottom][j]);
            }
            if(res.size() == numbers){
                break;
            }
            bottom--;
            for (int i = bottom; i >= top; --i){
                res.add(matrix[i][left]);
            }
            if(res.size() == numbers){
                break;
            }
            left++;
        }
        return res;
    }
}
