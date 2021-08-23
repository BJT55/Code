import java.util.Arrays;

public class Solution61 {
    public boolean isStraight(int[] nums) {
        int zero = 0;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zero++;
                continue;
            }

            if (i == 0){
                continue;
            }
            if(nums[i] == nums[i-1]) return false;

            if (nums[i]-nums[i-1] != 1 && nums[i-1] != 0){
                count += nums[i]-nums[i-1]-1;
            }
        }

        return count <= zero ? true : false;
    }
}
