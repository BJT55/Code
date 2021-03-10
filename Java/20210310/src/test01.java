import java.util.Stack;

public class test01 {
}

class Solution01{
    public boolean isValid (String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if (c == '{' || c == '(' ||  c == '['){
                stack.push(c);
            }
            if (stack.isEmpty()){
                return false;
            }
            Character top = stack.pop();
            if (top == '(' && c == ')')
                continue;
            if (top == '{' && c == '}')
                continue;
            if (top == '[' && c == ']')
                continue;
            return false;
        }
        return true;
    }
}