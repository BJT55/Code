import java.util.Arrays;

public class Solution1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0, tmp = 0;
        for(int i = 0, j = 0; j < nums.length; ++j){
            while(nums[j] * (j-i) - tmp > k){
                tmp -= nums[i++];
            }
            tmp += nums[j];
            max = Math.max(max,j-i+1);
        }
        return max;
    }
}
