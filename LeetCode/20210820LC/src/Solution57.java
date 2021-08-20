public class Solution57 {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1)
            return new int[0];
        int left = 0, right = nums.length-1;
        while (left < right){
            if (nums[left] + nums[right] < target){
                left++;
            }else if (nums[left]+nums[right] > target){
                right--;
            }else {
                return new int[]{nums[left],nums[right]};
            }
        }
        return new int[0];
    }
}
