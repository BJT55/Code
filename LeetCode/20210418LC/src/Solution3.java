import java.util.HashSet;
import java.util.Set;

class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = 0,tmp = 0;
        a:for(int i = 0; i < s.length(); ++i){
            for(int j = i; j < s.length(); ++j){
                char c = s.charAt(j);
                if(set.contains(c)){
                    len = Math.max(len,tmp);
                    tmp = 0;
                    set.clear();
                    break;
                }else{
                    set.add(c);
                    tmp++;
                }
                if(j == s.length()-1){
                    // 已经遍历完字符串,得到最大值,结束循环
                    break a;
                }
            }
        }
        len = Math.max(len,tmp);
        return len;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
}