class test21 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            while(left < right && nums[left] % 2 == 1){
                left++;
            }
            while(left < right && nums[right] % 2 == 0){
                right--;
            }
            swap(left,right,nums);
            left++;
            right--;
        }
        return nums;
    }
    public void swap(int x, int y, int[] nums){
        int tmp = nums[y];
        nums[y] = nums[x];
        nums[x] = tmp;
    }
}