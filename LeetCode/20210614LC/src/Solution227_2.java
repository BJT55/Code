import java.util.Stack;

class Solution227_2 {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int digit = 0;
        char sign = '+';
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if(Character.isDigit(c) ){
                digit = digit*10 + c -'0';
            }
            if ( (!Character.isDigit(c) && c != ' ') || i == s.length()-1){
                if(sign == '-'){
                    stack.push(-digit);
                }else if(sign == '+'){
                    stack.push(digit);
                }else if(sign == '*'){
                    stack.push(stack.pop()*digit);
                }else if(sign == '/'){
                    stack.push(stack.pop()/digit);
                }
                digit = 0;
                sign = c;
            }
        }
        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
    }
}