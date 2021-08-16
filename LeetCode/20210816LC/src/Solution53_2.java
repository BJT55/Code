public class Solution53_2 {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while (i <= j){
            int mid = (i+j)/2;
            if (nums[mid] <= target){
                i = mid+1;
            }else {
                j = mid;
            }
        }

        int right = i;
        if (j >= 0 && nums[j] != target)
            return 0;

        i = 0; j = nums.length-1;
        while (i <= j){
            int mid = (i+j)/2;
            if (nums[mid] < target){
                i = mid+1;
            }else {
                j = mid-1;
            }
        }
        int left = j;
        return right-left-1;
    }
}
