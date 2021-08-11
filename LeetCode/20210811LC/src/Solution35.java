public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1, res = nums.length;
        while (left <= right){
            int mid = (left+right)/2;
            if (target <= nums[mid]){
                right = mid-1;
                res = mid;
            }else {
                left = mid+1;
            }
        }
        return res;
    }
}
