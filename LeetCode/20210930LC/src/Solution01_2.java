import java.util.Scanner;

// 输出回文串
public class Solution01_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(shortestPalindrome(s));
    }

    private static String shortestPalindrome(String s) {
        // 逆序源字符串
        String reverse = new StringBuilder(s).reverse().toString();
        String res = "";
        int len = Integer.MAX_VALUE;

        if (isPalindromicString(s)){
            return s;
        }else {
            for (int i = 0; i < reverse.length(); i++){
                if (reverse.startsWith(s.substring(i))){
                    String tmp = s + reverse.substring(reverse.length()-i);
                    if (tmp.length() < len){
                        len = tmp.length();
                        res = tmp;
                    }
                }
            }
        }
        return res;
    }

    private static boolean isPalindromicString(String s) {
        int left = 0, right = s.length()-1;
        while (left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if (c1 != c2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
