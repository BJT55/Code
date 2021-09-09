import java.util.Arrays;

public class Solution169 {
    public int majorityElement(int[] nums) {
        int count = 1;
        int bound = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != bound){
                count--;
                if (count == 0){
                    bound = nums[i+1];
                }
            }else {
                count++;
            }
        }
        return bound;
    }
}
