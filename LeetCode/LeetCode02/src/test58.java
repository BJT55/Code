//给你一个字符串 s，由若干单词组成，单词之间用空格隔开。
//返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
//单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
public class test58 {
    public static void main(String[] args) {
        Solution58 solution = new Solution58();
        String s = "   a    ";
//        System.out.println(s.length());
        System.out.println(solution.lengthOfLastWord(s));
    }
}

class Solution58 {
    public int lengthOfLastWord(String s) {
        int num = 0;
        int i = s.length() - 1;
        int len = i;
        for (; i >= 0; i--){
            if (s.charAt(i) == ' '){
                len--;
            }else break;
        }
        i = len;
        for (; i >= 0; i--){
            if ( !Character.isLetter(s.charAt(i))){
                break;
            }else num++;
        }
        return num;
    }
}