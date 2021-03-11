public class test674 {
    public static void main(String[] args) {
        Solution674 s = new Solution674();
        int[] nums = {1,3,5,4,7};
        System.out.println(s.findLengthOfLCIS(nums));
    }
}

/*
class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = Integer.MIN_VALUE;
        int left = 0, right = 0;
        for(int i = 1; i < nums.length; ++i){
            if(nums[i] > nums[i-1]){
                right++;
                count++;
            }else{
                left = i;
                right = i;
                count = 1;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}*/

class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int start = 0;
        int max = 0;
        for(int i = 0; i < nums.length; ++i){
            if( i > 0 && nums[i] <= nums[i-1] ){
                start = i;
            }
            max = Math.max(max,i - start + 1);
        }
        return max;
    }
}