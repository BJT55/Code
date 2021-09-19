import java.util.HashMap;
import java.util.Map;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        int maxCount = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
            }
        }

        while (k > 0){
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue() == maxCount){
                    res[k-1] = entry.getKey();
                    k--;
                }
            }
            maxCount--;
        }
        return res;
    }
}
