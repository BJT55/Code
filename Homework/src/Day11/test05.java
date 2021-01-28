package Day11;
// 443
//给定一组字符，使用原地算法将其压缩。
//压缩后的长度必须始终小于或等于原数组长度。
//数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
//在完成原地修改输入数组后，返回数组的新长度。

import java.util.Arrays;

public class test05 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','c','c','c','c','d'};
        compress(chars);
        System.out.println(Arrays.toString(chars));
    }

    public static int compress(char[] chars){
        StringBuilder sb = new StringBuilder();
        int len = chars.length;
        int left = 0;
        int right = 0;
        while (left < len){
            right++;
            while ( right < len && chars[left] == chars[right]){
                right++;
            }
            sb.append(chars[left]);
            if ( right - left > 1){
                sb.append( right - left);
            }
            left = right;
        }
        String s = sb.toString();
        for (int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}
