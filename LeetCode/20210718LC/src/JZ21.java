public class JZ21 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            while( left < right && nums[left]%2 == 1){
                left++;
            }
            while( left < right && nums[right]%2 == 0){
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
}


