import java.util.HashMap;
import java.util.Map;

public class test645 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,2,4};
        System.out.println(s.findErrorNums(nums));
    }
}
/*
class Solution645 {
    public int[] findErrorNums(int[] nums) {
        Map< Integer, Integer> map = new HashMap<>();
        int repete = 0, lost = 0;
        for (int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);
        }
        for (int i = 1; i <= nums.length; ++i){
            if (map.containsKey(i)){
                if (map.get(i) == 2){
                    repete = i;
                }
            }else{
                lost = i;
            }
        }
        return new int[]{repete,lost};
    }
}*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length];
        for(int n : nums){
            count[n-1]++;
            // 此时 重复数 会被重复++两遍
            // 而 丢失的数 没有执行++ 因此还是0
        }
        int repete = 0, lost = 0;
        for(int i = 0; i < count.length; ++i){
            if(count[i] == 2)
                repete = i + 1;
            if(count[i] == 0)
                lost = i + 1;
        }
        return new int[]{repete,lost};
    }
}