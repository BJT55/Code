import java.util.HashMap;

public class Solution02 {
    public int findDuplicate (int[] nums) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if (map.get(n) > 1){
                return n;
            }
        }
        return -1;
    }
}
