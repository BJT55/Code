import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test387 {
    public static void main(String[] args) {
        Solution387 st = new Solution387();
        String s = "loveleetcode";
    }
}

class Solution387 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < s.length(); ++i){
            if(map.get(s.charAt(i)) == 1) return i;
            // 同意转换：
//            int count = map.getOrDefault(s.charAt(i),0);
//            if(count == 1) return i;
        }
        return -1;

    }
}
