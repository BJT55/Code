public class Solution53_1 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int count = 0;
        while(left < right){
            int mid = (right + left)/2;

            if(nums[mid] < target){
                left = mid+1;
            }
            if(nums[mid] >= target){
                right = mid;
            }
        }
        while(left < nums.length && nums[left] == target){
            count++;
            left++;
        }
        return count;
    }
}
