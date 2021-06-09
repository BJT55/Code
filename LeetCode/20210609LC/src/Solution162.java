class Solution162 {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[mid+1]){
                // 峰值在左边
                right = mid;
            }else{
                // 峰值在右边
                left = mid+1;
            }
        }
        return left;
    }
}