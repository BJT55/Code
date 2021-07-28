public class Test3 {
    public void bubbleSort(int[] nums){
        int i = 0;
        for (; i < nums.length; ++i){
            for (int j = nums.length-1; j >= i; --j){
                if (nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
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
