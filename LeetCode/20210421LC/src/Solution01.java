import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution01 {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0){
            return new int[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        System.out.println(twoSum(nums,6));
    }
}