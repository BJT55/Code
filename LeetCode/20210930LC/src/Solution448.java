import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] tmp = Arrays.copyOf(nums, nums.length);
        for (int n : nums) {
            if (tmp[n-1] > 0) {
                tmp[n-1] *= -1;
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > 0) {
                res.add(i+1);
            }
        }
        return res;
    }
}
