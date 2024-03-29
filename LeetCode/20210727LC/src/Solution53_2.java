public class Solution53_2 {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] != mid){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left == nums.length-1 && nums[left] == left ? left+1 : left;
    }
}
