import java.util.HashMap;
import java.util.Map;

public class test392 {

}

/*

class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(i)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}*/


class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int j = 0;
        for (int i = 0; i < ct.length && j < cs.length; ++i){
            if (cs[j] == ct[i])  j++;
        }
        return j == cs.length;
    }
}