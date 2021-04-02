class Solution53_2 {
    public int missingNumber(int[] nums) {
        int sum = 0, realitySum = 0;
        for(int num : nums){
            sum += num;
        }
        for(int i = 0; i <= nums.length; i++){
            realitySum += i;
        }
        return realitySum - sum;
    }
}