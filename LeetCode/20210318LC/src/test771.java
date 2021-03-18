import java.util.*;

public class test771 {
}

class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Map <Character, Integer> map = new HashMap<>();
        for(char c : stones.toCharArray()){
            int num = map.getOrDefault(c,0)+1;
            map.put(c,num);
        }
        for(char c : jewels.toCharArray()){
            if(map.containsKey(c)){
                count += map.get(c);
            }
        }
        return count;
    }
}
