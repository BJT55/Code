import java.util.Scanner;
import java.util.Stack;

public class Day41_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = Integer.parseInt(in.nextLine());
            String s = in.nextLine();
            Stack<Integer> stack = new Stack<>();
            char[] c = s.toCharArray();
            for (int i = 0; i < s.length(); ++i){
                if (c[i] >= '0' && c[i] <= '9'){
                    int num = c[i]-'0';
                    for(int t = i+1; t < s.length(); t++){
                        if (c[t] >= '0' && c[t] <= '9') {
                            num = num*10 + c[t]-'0';
                            i = t;
                        }else {
                            break;
                        }
                    }
                    stack.push(num);
                }
                else if (c[i] == '*'){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(x*y);
                }
                else if (c[i] == '/'){
                    int x = stack.pop();
                    int y = stack.pop();
                    if (x != 0) {
                        stack.push(y/x);
                    }
                }
                else if (c[i] == '+'){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(x+y);
                }
                else if (c[i] == '-'){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y-x);
                }
            }
            System.out.println(stack.pop());
        }
    }
}
