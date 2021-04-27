class Solution33 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len -1;
        while (left < right){
            int mid = (left+right)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < nums[right]){
                if (nums[mid] < target && target <= nums[right]){
                    // target在右边
                    left = mid+1;
                }
                else {
                    // target在左边
                    right = mid - 1;
                }
            }
            else {
                if (nums[mid] > target && target >= nums[left]){
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}