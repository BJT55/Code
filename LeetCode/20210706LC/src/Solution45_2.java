class Solution45_2 {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int count = 0; // 记录跳跃的次数
        int curDistance = 0; // 记录当前的覆盖最大区域
        int maxDistance = 0; // 最大的覆盖区域
        for (int i = 0; i < nums.length; ++i){
            maxDistance = Math.max(maxDistance,nums[i]+i);
            if (maxDistance >= nums.length-1){
                count++;
                break;
            }
            // 走到当前覆盖的最大区域时, 更新下一步可达的最大区域
            if (i == curDistance){
                curDistance = maxDistance;
                count++;
            }
        }
         return count;
    }
}