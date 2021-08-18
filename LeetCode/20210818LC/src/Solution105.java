public class Solution105 {
    public int search (int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length;
        while (left < right){
            int mid = (left+right)/2;
            if (nums[mid] < target){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }
}
