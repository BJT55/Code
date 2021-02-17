import java.util.Arrays;

public class test283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution283 s = new Solution283();
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution283 {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length){
            if(nums[right] != 0){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
            }
            right++;
        }
    }
}