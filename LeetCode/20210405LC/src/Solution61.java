import java.util.Arrays;

class Solution61 {
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int king = 0,tmp = 0;;
        for(int i = 0; i < nums.length-1; ++i){
            if(nums[i] == 0){
                king++;
                continue;
            }
            if(nums[i+1] - nums[i] > 1){
                tmp += Math.abs(nums[i+1]-nums[i]);
            }
            if(nums[i] == nums[i+1]){
                return false;
            }
        }

        if(tmp-1 <= king || tmp == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,9,0,11};
        System.out.println(isStraight(nums));
    }
}