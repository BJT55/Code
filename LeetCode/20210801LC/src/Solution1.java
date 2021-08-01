import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp)){
                return new int[]{i,map.get(tmp)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
