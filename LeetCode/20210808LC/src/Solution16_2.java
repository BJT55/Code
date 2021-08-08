import java.util.HashSet;
import java.util.Set;

public class Solution16_2 {
    public int lengthOfLongestSubstring(String s) {
        String res = "";
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++){
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    res = res.length() > j-i+1 ? res : s.substring(i,j);
                }else {
                    set.remove(s.charAt(j));
                    break;
                }
            }
        }
        return 0;
    }
}
