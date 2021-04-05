import java.util.ArrayList;
import java.util.List;

public class Solution57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int right , left , sum = 0;
        for(left = 1, right = 1; right < target; ++right){
            sum += right;
            while(sum > target){
                sum -= left++;
            }
            if(sum == target){
                int[] temp = new int[right - left + 1];
                for(int i = 0; i < temp.length; ++i){
                    temp[i] = left+i;
                }
                list.add(temp);
            }
        }

        int[][] res = new int[list.size()][];
        for(int i = 0; i < res.length; ++i){
            res[i] = list.get(i);
        }
        return res;
    }
}
