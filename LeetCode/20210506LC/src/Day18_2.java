import java.util.Scanner;

public class Day18_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String mark = in.nextLine();
            String str = in.nextLine();
            System.out.println(isRightMark(mark,str));
        }
    }
    public static boolean isRightMark(String mark, String str){
        int len1 = mark.length(), len2 = str.length();
        int i = 0, j = 0;
        while (i < len1 && j < len2){
            if (str.charAt(j) == '*'){
                while (i < len1 && j < len2 && mark.charAt(i) != str.charAt(j)){
                    i++;
                    j++;
                }
            }
            else if (str.charAt(i) == '?'){
                i++;
                j++;
            }
            else if (str.charAt(i) != mark.charAt(j)){
                return false;
            }
        }

        if (i == len1 && j != len2){
            // 通配符表达式已遍历完毕,但匹配字符串还有未被匹配的字符
            return false;
        }
        if (i != len1 && j == len2){
            // 通配符表达式未遍历完毕,但匹配字符已经遍历完毕
            for (int k = len2; k < len1; ++k){
                if (mark.charAt(k) != '*'){
                    return false;
                }
            }
        }
        return true;
    }
}
