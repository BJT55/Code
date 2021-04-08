class Solution59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0)
            return new int[0];

        int[] res = new int[nums.length-k+1];
        for(int i = 0; i < nums.length-k+1; ++i){
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i+k; ++j){
                max = Math.max(max, nums[j]);
            }
            res[i] = max;
        }
        return res;
    }
}