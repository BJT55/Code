import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution39 {
    // 排序：
    public int majorityElement01(int[] nums) {
        int mid = nums.length/2;
        Arrays.sort(nums);
        return nums[mid];
    }
    // 哈希
    public int majorityElement02(int[] nums) {
        Map<Integer, Integer> map;
        map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0) + 1);
            if(map.get(x) > nums.length>>1){
                return x;
            }
        }
        return -1;
    }
    // 摩尔投票法：
    public int majorityElement03(int[] nums) {
        int count = 0, majority = nums[0];
        for (int num : nums){
            if (count == 0){
                majority = num;
            }
            if (num == majority){
                count++;
            }else {
                count--;
            }
        }
        return majority;
    }
}
