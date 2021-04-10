class Solution03 {
    public static int findRepeatNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    res = nums[i];
                    break;
                }
                int tmp = nums[i];
                nums[i] = nums[nums[i]];
                nums[tmp] = tmp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(nums));
    }
}