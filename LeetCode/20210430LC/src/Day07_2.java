import java.util.Stack;

public class Day07_2 {
    public boolean chlParenthesis(String a, int n){
        if (n != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); ++i){
            if (a.charAt(i) == '('){
                stack.push('(');
            }else if (a.charAt(i) == ')'){
                if (stack.isEmpty())
                    return false;
                else if (stack.peek() == '(')
                    stack.pop();
            }else
                return false;
        }
        return true;
    }
}
