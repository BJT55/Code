import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution03 {
    public int findRepeatNumber01(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for (int n : nums){
            if (map.get(n) > 1){
                return n;
            }
        }
        return -1;
    }

    public int findRepeatNumber02(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            if (set.contains(n))
                return n;
            set.add(n);
        }
        return -1;
    }

    public int findRepeatNumber03(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if (nums[i] == i){
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]])
                return nums[i];
            swap(nums,i,nums[i]);
        }
        return -1;
    }
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
