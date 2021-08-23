public class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];

        int max = nums[0], pre = 0;
        for (int x : nums){
            pre = Math.max(pre+x,x);
            max = Math.max(max,pre);
        }
        return max;
    }
}
