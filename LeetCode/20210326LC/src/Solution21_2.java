class Solution21_2 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            // &1 为 1 时是奇数，找到左边不为奇数的停止循环
            while(left < right && ( (nums[left]&1 )== 1)){
                left++;
            }
            // &1 为 0 时是偶数，找到右边不为偶数的停止循环
            while(left < right && ( (nums[right]&1) == 0)){
                right--;
            }
            swap(nums, left, right);
        }
        return nums;
    }
    public void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
        return ;
    }
}