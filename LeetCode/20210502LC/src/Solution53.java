class Solution53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for(int n : nums){
            tmp = Math.max(tmp+n,n);
            max = Math.max(tmp,max);
        }
        return max;
    }
}