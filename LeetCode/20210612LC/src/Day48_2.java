import java.util.ArrayList;
import java.util.List;

public class Day48_2 {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        List<Integer> list = new ArrayList<>();
        int row = mat.length;
        int col = mat[0].length;
        int up = 0, down = row-1, left = 0, right = col-1;
        int i = 0, j = 0;
        while (up <= down && left <= right){
            while (j <= right ){  // 向右遍历
                list.add(mat[up][j]);
                j++;
            }
            i = ++up;
            if (i == down){
                break;
            }
            while (i <= down){   // 向下遍历
                list.add(mat[i][right]);
                i++;
            }
            j = --right;
            if (j == left){
                break;
            }
            while (j >= left){  // 向左遍历
                list.add(mat[down][j]);
                j--;
            }
            i = --down;
            if (i == up){
                break;
            }
            while (i >= up){
                list.add(mat[i][left]);
                i--;
            }
            j = ++left;
            if (j == right){
                break;
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for (int num: list) {
            res[index++] = num;
        }
        return res;
    }
}
