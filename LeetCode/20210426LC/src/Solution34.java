class Solution34 {
    public static int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len-1;
        while(left <= right){
            int mid = (left+right) / 2;
            if(nums[mid] == target){
                if(nums[left] == target && nums[right] == target){
                    return new int[]{left,right};
                }
                if(nums[left] != target){
                    left++;
                }
                if(nums[right] != target){
                    right--;
                }
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums,target));
    }
}