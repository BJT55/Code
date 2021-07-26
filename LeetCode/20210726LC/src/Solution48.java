import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution48 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();

        for (int start = 0, end = 0; end < s.length(); end++){
            char c = s.charAt(end);
            while (set.contains(c)){
                set.remove(s.charAt(start++));
            }
            set.add(c);
            res = Math.max(res,end-start+1);
        }
        return res;
    }

    public int lengthOfLongestSubstring_2(String s) {
        int max = 0, start = -1;

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)){
                start = Math.max(start,map.get(c));
            }
            map.put(c,i);
            max = Math.max(max,i-start);
        }
        return max;
    }
}
