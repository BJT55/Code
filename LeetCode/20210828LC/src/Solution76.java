import javax.swing.plaf.SliderUI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution76 {
    Map<Character,Integer> map1 = new HashMap<>();
    Map<Character,Integer> map2 = new HashMap<>();

    public String minWindow(String s, String t) {
        int tLen = t.length();
        for (int i = 0; i < tLen; i++) {
            char c = t.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        int left = 0, right = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = s.length();

        while (right < sLen){
            ++right;
            if (right < sLen && map1.containsKey(s.charAt(right))){
                map2.put(s.charAt(right),map1.getOrDefault(s.charAt(right),0)+1);
            }

            while (check() && left <= right){
                if (right-left+1 < len){
                    len = right-left+1;
                    ansL = left;
                    ansR = left + len;
                }

                if (map2.containsKey(s.charAt(left))) {
                    map2.put(s.charAt(left),map1.getOrDefault(s.charAt(left),0)+1);
                }
                left++;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL,ansR);
    }

    private boolean check() {
        Iterator iter = map1.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (map2.getOrDefault(key,0) < val){
                return false;
            }
        }
        return true;
    }
}
