import java.util.Stack;

// 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，
// 判断字符串是否有效。
// 有效字符串需满足：左括号必须用相同类型的右括号闭合;左括号必须以正确的顺序闭合。
public class test20 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        String str = "(";
        System.out.println(solution20.isValid(str));
    }
}
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if ( stack.isEmpty() || c != stack.pop())
                // 栈为空（代表右符号过多） 或者 出栈的与 c 不相同
                return false;
        }
        // 若遍历完s后，栈中仍有值，则证明s中存在多余的左符号
        return stack.isEmpty();
    }

}