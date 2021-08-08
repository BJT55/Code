import java.util.HashSet;
import java.util.Set;

public class Solution16 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        int res = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++){
            Set<Character> set = new HashSet<>();
            set.add(c[i]);
            int j = i+1;
            for (; j < c.length; j++){
                if (!set.contains(c[j])){
                    set.add(c[j]);
                }else {
                    res = res > j-i ? res : j-i;
                    break;
                }
            }
            res = res > j-i ? res : j-i;
        }
        return res;
    }
}
