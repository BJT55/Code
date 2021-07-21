import java.util.Stack;

public class JZ31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int elem : pushed){
            stack.push(elem);
            while( i < popped.length && !stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return i == popped.length;
    }
}
