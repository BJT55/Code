import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1, right = nums.length-1;
            while (left < right){
                int tmp = nums[left]+nums[right]+nums[i];
                if (Math.abs(target-tmp) < Math.abs(target-res)){
                    res = tmp;
                }
                if (tmp > target){
                    right--;
                }else if (tmp < target){
                    left++;
                }else {
                    return target;
                }
            }
        }
        return res;
    }
}
