import java.util.ArrayList;
import java.util.List;

public class Solution57_2_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> vec = new ArrayList<>();
        for (int left = 1, right = 2; left < right;){
            int sum = (left+right)*(right-left+1)/2;
            if (sum == target){
                int[] res = new int[right-left+1];
                for (int i = left; i <= right; ++i){
                    res[i-left] = i;
                }
                vec.add(res);
                left++;
            }else if (sum < target){
                right++;
            }else {
                left++;
            }
        }
        return vec.toArray(new int[vec.size()][]);
    }
}
