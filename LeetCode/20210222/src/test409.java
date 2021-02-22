public class test409 {
}

class Solution409 {
    public int longestPalindrome(String s) {
        int[] c = new int[58];
        int count = 0;
        boolean flag = false;  // 判断是否有单个字符
        for(int i = 0; i < s.length(); i++){
            c[s.charAt(i) - 'A']++;
        }
        for(int i = 0; i < 58; ++i){
            if(c[i] != 0){
                if(c[i]/2 != 0)  count += c[i]/2 * 2;
                if(c[i]%2 != 0) flag = true;
            }
        }
        if(flag)  return count+1;
        return count;
    }
}