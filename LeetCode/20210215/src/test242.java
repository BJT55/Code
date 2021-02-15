import java.util.Arrays;

public class test242 {

}

/*
//方法一：
class Solution242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc,tc);
    }
}*/

//方法二：
class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return  false;
        int[] table = new int[26];
        for (int i = 0; i < s.length(); ++i){
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); ++i){
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
