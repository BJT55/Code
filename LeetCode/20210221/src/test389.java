public class test389 {
}

/*
// 方法一：计数
class Solution389 {
    public char findTheDifference(String s, String t) {
        int[] letter = new int[26];
        for (int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            letter[c - 'a']++;
        }
        for (int i = 0; i < t.length(); ++i){
            char c = t.charAt(i);
            letter[c - 'a']--;
            if(letter[c - 'a'] < 0) return c;
        }
        return ' ';
    }
}*/


/*
// 方法二：求和
class Solution389 {
    public char findTheDifference(String s, String t) {
        int sumS = 0,sumT = 0;
        for (int i = 0; i < s.length(); ++i){
            sumS += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i){
            sumT += t.charAt(i);
        }
        return (char) (sumT - sumS);
    }
}
*/



// 方法三：位运算
class Solution389 {
    public char findTheDifference(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); ++i){
            ret ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i){
            ret ^= t.charAt(i);
        }
        return (char)ret;
    }
}
