import java.util.Stack;

public class Solution31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int elem : pushed){
            stack.push(elem);
            while (!stack.isEmpty() &&
                    stack.peek() == popped[i] &&
                    i < popped.length){
                i++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}