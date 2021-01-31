import java.util.Scanner;
import java.util.Stack;
// 按照原来的顺序输出字符串，除去重复字符
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(func(str));
    }
    public static String func(String str){
        String s = "";
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for (int i = str.length() - 1; i > 0; i--){
            for (int j = i - 1; j >= 0; j--){
                if (str.charAt(j) == str.charAt(i)){
                    flag = false;
                    break;
                }else {
                    flag = true;
                }
            }
            if (flag){
                stack.push(str.charAt(i));
            }
        }
        stack.push(str.charAt(0));
        while (!stack.isEmpty()){

            s += stack.pop();
        }
        return s;
    }
}
