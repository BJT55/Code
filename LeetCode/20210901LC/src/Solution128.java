import java.util.Arrays;

public class Solution128 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            int tmp = 1;
            for (int j = i; j < nums.length; j++) {
                if (nums[j]-1 == nums[j-1]){
                    tmp++;
                }
                else if (nums[j] == nums[j-1]){
                    continue;
                }
                else {
                    break;
                }
                max = Math.max(max,tmp);
            }
        }
        return max;
    }
}
