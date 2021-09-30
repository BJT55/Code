import java.util.ArrayList;
import java.util.List;

public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int tmp = Math.abs(nums[i]);
            if (nums[tmp-1] > 0){
                nums[tmp-1] *= -1;
            }else {
                res.add(tmp);
            }
        }
        return res;
    }
}
