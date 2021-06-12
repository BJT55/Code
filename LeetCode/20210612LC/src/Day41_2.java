import java.util.Scanner;
import java.util.Stack;

// Emacs计算器
public class Day41_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            in.nextLine();
            Stack<Integer> stack = new Stack<>();
            char[] arr = in.nextLine().toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= '0' && arr[i] <= '9'){
                    int num = arr[i]-'0';
                    for(int t = i+1; t < arr.length; t++){
                        if (arr[t] >= '0' && arr[t] <= '9') {
                            num = num*10 + arr[t]-'0';
                            i = t;
                        }else {
                            break;
                        }
                    }
                    stack.push(num);
                }
                else if (arr[i] == '*'){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(x*y);
                }
                else if (arr[i] == '/'){
                    int x = stack.pop();
                    int y = stack.pop();
                    if (x != 0) {
                        stack.push(y/x);
                    }
                }
                else if (arr[i] == '+'){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(x+y);
                }
                else if (arr[i] == '-'){
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y-x);
                }
            }
            System.out.println(stack.pop());
        }
    }
}
