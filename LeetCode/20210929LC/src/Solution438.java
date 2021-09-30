import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length(), m = p.length();

        if (m > n) return res;
        char[] cs = s.toCharArray();
        char[] cp = p.toCharArray();
        int[] ss = new int[26];
        int[] pp = new int[26];

        for (char c : cp){
            pp[c-'a']++;
        }
        for (int i = 0; i < m; i++){
            ss[cs[i]-'a']++;
        }
        if (Arrays.equals(ss,pp)){
            res.add(0);
        }

        for (int i = m; i < n; i++){
            ss[cs[i-m]-'a']--;
            ss[cs[i]-'a']++;
            if (Arrays.equals(ss,pp)){
                res.add(i-m+1);
            }
        }
        return res;
    }
}
