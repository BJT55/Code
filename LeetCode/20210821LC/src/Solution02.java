import java.util.HashMap;
import java.util.Map;

public class Solution02 {
    public static void main(String[] args) {
        System.out.println(findKthBit(3,1));
    }
    public static Map<Integer,String> map = new HashMap<>();
    public static char findKthBit (int n, int k) {
        // write code here
        map.put(1,"a");
        if (map.containsKey(n)){
            return map.get(n).charAt(k-1);
        }

        for (int i = 2; i <= n; i++){
            StringBuilder tmp = new StringBuilder();
            tmp.append(map.get(i-1));
            tmp.append((char)('a'+i-1));
            tmp.append(reverse(invert(map.get(i-1),(char)('a'+i-2))));
            map.put(i,tmp.toString());
        }
        return map.get(n).charAt(k-1);
    }
    private static String invert(String s , char c){
        StringBuilder res = new StringBuilder();
        for (char i : s.toCharArray()){
            if (i != c) res.append(i);
            else {
                char tmp = (char)('z'- ( c-'a'));
                res.append(tmp);
            }
        }
        return res.toString();
    }
    private static String reverse(String s){
        StringBuilder res = new StringBuilder(s);
        return res.reverse().toString();
    }
}
