class Solution53 {
    public int search(int[] nums, int target) {
        int count  = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == target)
                count++;
        }
        return count;
    }

    // 二分查找
    public int search02(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int count = 0;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= target){
                right = mid;
            }
            if(nums[mid] < target){
                left = mid+1;
            }
        }
        while(left < nums.length && nums[left++] == target)
            count++;
        return count;
    }
}