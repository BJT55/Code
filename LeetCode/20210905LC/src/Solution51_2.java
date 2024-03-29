public class Solution51_2 {
    public int reversePairs(int[] nums) {
        int len = nums.length;
        if (len < 2){
            return 0;
        }

        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }

        int[] tmp = new int[len];
        return reversePairs(copy,0,len-1,tmp);
    }

    private int reversePairs(int[] nums, int left, int right, int[] tmp) {
        if (left == right) return 0;

        int mid = left + (right-left)/2;
        int leftPairs = reversePairs(nums,left,mid,tmp);
        int rightPairs = reversePairs(nums,mid+1,right,tmp);

        if (nums[mid] <= nums[mid+1]){
            return leftPairs + rightPairs;
        }

        int crossPairs = mergeAndCount(nums,left,mid,right,tmp);
        return leftPairs + rightPairs + crossPairs;
    }

    private int mergeAndCount(int[] nums, int left, int mid, int right, int[] tmp) {
        for (int i = left; i <= right; i++){
            tmp[i] = nums[i];
        }

        int i = left;
        int j = mid+1;
        int count = 0;
        for (int k = left; k <= right; k++){
            if (i == mid+1){
                nums[k] = tmp[j];
                j++;
            }else if (j == right+1){
                nums[k] = tmp[i];
                i++;
            } else if (tmp[i] <= tmp[j]){
                nums[k] = nums[i];
                i++;
            }else {
                nums[k] = nums[j];
                j++;
                count += (mid-i+1);
            }
        }
        return count;
    }
}
