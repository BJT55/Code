public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums,target-1);
        int right = binarySearch(nums,target)-1;
        if (left <= right && nums[left] == target){
            return new int[]{left,right};
        }
        return new int[]{-1,-1};
    }

    // 求第一个大于target的下标
    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length-1, res = nums.length;
        while (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] > target){
                right = mid-1;
                res = mid;
            }else {
                left = mid+1;
            }
        }
        return res;
    }
}
