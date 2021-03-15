public class test747 {
}


class Solution747 {
    public int dominantIndex(int[] nums) {
        int max = 0,index = 0;
        for(int i = 0; i < nums.length; ++i){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        for(int num : nums){
            if(num != max && num != 0){
                if(max / num < 2){
                    return -1;
                }
            }
        }
        return index;
    }
}