import java.util.Arrays;
import java.util.Stack;

public class test414 {
}

class Solution414 {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i){
            if (third >= nums[i] || second == nums[i] || first == nums[i]) continue;
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            }else if(nums[i] > second){
                third = second;
                second = nums[i];
            }else third = nums[i];
        }
        return (int)(third == Long.MIN_VALUE ? first : third);
    }
}