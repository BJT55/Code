import java.util.*;

class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] res = new int[k];
        int index = 0;
        int maxCount = Integer.MIN_VALUE, tmp = 0;
        for (int i = 0; i < k; ++i){
            for (Integer num: map.keySet()) {
                if (map.get(num) > maxCount){
                    tmp = num;
                    maxCount = map.get(num);
                }
            }
            res[i] = tmp;
            map.remove(tmp);
            tmp = 0;
            maxCount = Integer.MIN_VALUE;
        }
        return res;
    }
}