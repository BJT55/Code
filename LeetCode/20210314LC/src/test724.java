public class test724 {
    public static void main(String[] args) {
        Solution724 s = new Solution724();
        int[] nums = {1,7,3,6,5,6};
        System.out.println(s.pivotIndex(nums));
    }
}


class Solution724 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums)
            sum += num;

        int leftSum = 0;
        for(int i = 0; i < nums.length; ++i){
            if(leftSum * 2 + nums[i] == sum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}