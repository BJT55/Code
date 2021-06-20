class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        long  a = Integer.MAX_VALUE;
        long  b = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= a){
                a = nums[i];
            }else if (nums[i] > a && nums[i] <= b){
                b = nums[i];
            }else {
                return true;
            }
        }
        return false;
    }
}