public class Solution33 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return -1;
        if (len == 1) return nums[0] == target ? 0 : -1;

        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] == target ){
                return mid;
            }

            if (nums[0] <= nums[mid]){
                if (nums[0] <= target && target < nums[mid]){
                    // target 在左边 [0,mid] 之间
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if (nums[mid] < target && target <= nums[len-1]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
