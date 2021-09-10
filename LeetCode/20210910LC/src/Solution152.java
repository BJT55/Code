public class Solution152 {
    public int maxProduct(int[] nums) {
        int max = nums[0],min = nums[0],res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int a = max*nums[i];
            int b = min*nums[i];
            max = Math.max(nums[i], Math.max(a,b));
            min = Math.min(nums[i], Math.min(a,b));
            res = Math.max(res, max);
        }
        return res;
    }
}
