import java.util.Stack;

public class Solution137 {
    public int solve (String s) {
        // write code here
        Stack<Character> opt = new Stack<>();
        Stack<Integer> num = new Stack<>();
        opt.push('#');
        s += "#";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9'){
                if (i == 0) {
                    int n = c-'0';
                    num.add(n);
                    continue;
                }
                else {
                    // 前一个是数字
                    if (Character.isDigit(s.charAt(i-1))){
                        int n = num.pop()*10 + c-'0';
                        num.add(n);
                    }else {
                        int n = c-'0';
                        num.add(n);
                    }
                }
            }else {
                // 当前字符是运算符
                if (c == '+' || c == '-' || c == '#'){
                    if (c=='-' && (i==0||s.charAt(i-1)=='(')){
                        num.push(0);
                        opt.push('-');
                        continue;
                    }

                    if (c=='+' && (i==0||s.charAt(i-1)=='(')){
                        continue;
                    }

                    while (opt.peek()=='*' || opt.peek()=='+' || opt.peek()=='-'){
                        int b = num.pop();
                        int a = num.pop();
                        char op = opt.pop();
                        switch (op){
                            case '*':
                                num.push(a*b);
                                break;
                            case '+':
                                num.push(a+b);
                                break;
                            case '-':
                                num.push(a-b);
                                break;
                        }
                    }
                    opt.push(c);
                }

                if (c == '(') opt.push(c);
                if (c == ')'){
                    while (opt.peek() != '(') {
                        int b = num.pop();
                        int a = num.pop();
                        char op = opt.pop();
                        switch (op) {
                            case '*':
                                num.push(a * b);
                                break;
                            case '+':
                                num.push(a + b);
                                break;
                            case '-':
                                num.push(a - b);
                                break;
                        }
                    }
                    // '('出栈
                    opt.pop();
                }
                if (c == '*') {
                    opt.push(c);
                }
            }
        }
        return num.peek();
    }
}
