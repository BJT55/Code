import java.util.Arrays;

public class Solution462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int bound = nums[nums.length/2];
        for (int n : nums){
            res += Math.abs(n-bound);
        }
        return res;
    }
}
