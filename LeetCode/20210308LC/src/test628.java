import java.util.Arrays;
import java.util.Map;

public class test628 {

}

// 排序：
class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0]*nums[1]*nums[len-1], nums[len-1]*nums[len-2]*nums[len-3]);
    }
}
