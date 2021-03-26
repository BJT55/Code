class Solution21 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            while(left < right && !evenNumber(nums[left])){
                left++;
            }
            while(left < right && evenNumber(nums[right])){
                right--;
            }
            swap(nums, left, right);
        }
        return nums;
    }
    public boolean evenNumber(int n){
        if(n % 2 == 0)
            return true;
        return false;
    }
    public void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
        return ;
    }
}