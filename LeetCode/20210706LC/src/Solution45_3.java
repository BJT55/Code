class Solution45_3 {
    public int jump(int[] nums) {
        return jump(nums,0);
    }
    private int jump(int[] nums, int index){
        if (index == nums.length-1){
            return 0;
        }

        int value = nums[index];
        if (value >= nums.length - index - 1){
            return 1;
        }

        int max = index;
        int lastIndex = index;
        for (int i = 0; i < value; ++i){
            if (index + i + 1 >= nums.length-1){
                return 1;
            }
            int temp = index+i+1+nums[index+i+1];
            if (max < temp){
                lastIndex = index + i + 1;
                max = temp;
            }
        }
        return 1 + jump(nums, lastIndex);
    }
}