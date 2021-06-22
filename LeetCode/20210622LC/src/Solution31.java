class Solution31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]){
            // 找到一位比右边数小的数
            i--;
        }
        if (i >= 0){
            int j = nums.length-1;
            while (j >= 0 && nums[i] >= nums[j]){
                // 找到一位比 nums[i] 稍大的数
                j--;
            }
            swap(nums,i,j);  // 交换较小数和较大数
        }
        sort(nums,i+1);  // 将较大数后面的数按升序重新排列(注意此时较大数的下标为i_
    }

    private void sort(int[] nums, int start) {
        int left = start, right = nums.length-1;
        for (int i = start; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    swap(nums,i,j);
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}