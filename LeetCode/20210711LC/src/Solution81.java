public class Solution81 {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0){
            return false;
        }
        if (nums.length == 1){
            return nums[0] == target;
        }
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                return true;
            }

            if (nums[left] == nums[mid] && nums[mid] == nums[right]){
                ++left;
                --right;
            }
            else if (nums[mid] >= nums[left]){
                if (nums[left] <= target && target < nums[mid]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }else {
                // 右半部分有序
                if (nums[mid] < target && target <= nums[nums.length-1]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
        }
        return false;
    }
}
