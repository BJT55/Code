import java.util.Stack;

public class Test01 {
    public static void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while( !stack.isEmpty()){
            int val = stack.pop();
            while ( !help.isEmpty() && val > help.peek()){
                stack.push(help.pop());
            }
            help.push(val);
        }

        while (!help.isEmpty()){
            stack.push(help.pop());
        }
        
    }
}
