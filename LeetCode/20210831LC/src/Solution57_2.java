import java.util.ArrayList;
import java.util.List;

public class Solution57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        for (int left = 1, right = 1, sum = 0; right < target; right++){
            sum += right;
            while (sum > right){
                sum -= left++;
            }

            if (sum == target){
                int[] tmp = new int[right-left+1];
                for (int i = 0; i < tmp.length; i++) {
                    tmp[i] = left+i;
                }
                list.add(tmp);
            }
        }

        int[][] res = new int[list.size()][];
        for (int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
