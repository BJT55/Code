import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution48 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0, j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            while (set.contains(c)){
                set.remove(s.charAt(i++));
            }
            set.add(c);
            max = Math.max(max,j-i+1);
        }
        return max;
    }

    public int lengthOfLongestSubstring02(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max = 0, tmp = 0;
        for (int j = 0; j < s.length(); j++) {
            int i = map.getOrDefault(s.charAt(j),-1);
            map.put(s.charAt(j),j);
            tmp = tmp < j-i ? tmp+1 : j-i;
            max = Math.max(max,tmp);
        }
        return max;
    }
}
