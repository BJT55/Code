package Day12;

import java.util.Stack;

// 150
// 根据逆波兰表示法，求表达式的值。
// 有效的运算符包括 +, -, *, / 。
// 每个运算对象可以是整数，也可以是另一个逆波兰表达式。
public class test05 {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evaIRPN(tokens));
    }

    public static int evaIRPN(String[] tokens){
        Stack<Integer> num = new Stack<>();
        Integer i,j;
        for (String s : tokens){
            switch (s){
                //当遇到算术运算符号时，从栈中弹出最近的两个数字，进行运算后将得到的数字压入栈中
                case "+":
                    j = num.pop();
                    i = num.pop();
                    num.push(i + j);
                    break;
                case "-":
                    j = num.pop();
                    i = num.pop();
                    num.push(i - j);
                    break;
                case "*":
                    j= num.pop();
                    i = num.pop();
                    num.push(i * j);
                    break;
                case "/":
                    j = num.pop();
                    i = num.pop();
                    num.push(i / j);
                    break;
                // 当s为数字时，将s转成Integer型压入栈中
                default:
                    num.push(Integer.valueOf(s));
                    break;
            }
        }
        return num.pop();
    }
}
