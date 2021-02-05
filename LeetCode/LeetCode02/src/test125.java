import java.util.Stack;

//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
public class test125 {
    public static void main(String[] args) {
        Solution125 solution = new Solution125();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(s));
    }
}


class Solution125 {
    public boolean isPalindrome(String s) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                tmp.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder tmp_rev = new StringBuilder(tmp).reverse();
        return tmp_rev.toString().equals(tmp.toString());
    }
}
