import java.util.HashMap;
import java.util.Map;

class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map12 = new HashMap<>();
        for (int a : nums1){
            for (int b : nums2){
                map12.put(a+b,map12.getOrDefault(a+b,0)+1);
            }
        }
        int res = 0;
        for (int c : nums3){
            for (int d : nums4){
                if (map12.containsKey(-(c+d))){
                    res += map12.get(-(c+d));
                }
            }
        }
        return res;
    }
}