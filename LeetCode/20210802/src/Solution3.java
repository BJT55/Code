import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int end = 0; end < s.length(); end++){
            char c = s.charAt(end);
            if (map.containsKey(c)){
                start = Math.max(map.get(c)+1,start);
            }
            max = Math.max(max,end-start+1);
            map.put(c,end);
        }
        return max;
    }
}
