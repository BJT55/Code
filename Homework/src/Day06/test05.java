package Day06;
// 给定一个字符串 S ，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转

import java.util.Stack;

public class test05 {
    public static void main(String[] args) {
        String S = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(S));
    }

    // 方法一：
/*    public static String reverseOnlyLetters(String S){
        StringBuilder s = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); ++i){
            if (Character.isLetter(S.charAt(i))){
                while ( !Character.isLetter(S.charAt(j))){
                    j--;
                }
                s.append(S.charAt(j--));
            }else {
                s.append(S.charAt(i));
            }
        }
        return s.toString();
    }*/


    // 方法二
    public static String reverseOnlyLetters(String S){
        Stack<Character> letters = new Stack<>();
        // 将所有字母压入栈中
        for (char c : S.toCharArray()){
            if (Character.isLetter(c)){
                letters.push(c);
            }
        }

        StringBuilder s = new StringBuilder();
        // 从头遍历 S ，若为字母，则从栈中取出一个字符（此时栈中的字母为倒序），否则直接添加
        for (char c : S.toCharArray()){
            if (Character.isLetter(c)){
                s.append(letters.pop());
            }else {
                s.append(c);
            }
        }
        return s.toString();
    }
}
