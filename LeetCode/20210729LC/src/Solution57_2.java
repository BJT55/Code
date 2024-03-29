import java.util.ArrayList;
import java.util.List;

public class Solution57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> vec = new ArrayList<>();
        int sum = 0, limit = (target-1)/2;
        for (int i = 1; i <= limit; ++i){
            for (int j = i; ; ++j){
                sum += j;
                if (sum > target){
                    sum = 0;
                    break;
                }
                else if (sum == target){
                    int[] res = new int[j-i+1];
                    for (int k = i; k <= j; ++k){
                        res[k-i] = k;
                    }
                    vec.add(res);
                    sum = 0;
                    break;
                }
            }
        }
        return vec.toArray(new int[vec.size()][]);
    }
}
