import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(popped.length == 0 && pushed.length == 0)
            return true;
        if(pushed.length == 0 || popped.length == 0)
            return false;

        Stack <Integer> stack = new Stack<>();
        int index = 0; // 记录popped数组进行到第几个数

        for(int elem : pushed){
            // 将pushed入栈
            stack.push(elem);
            while(index < popped.length && !stack.isEmpty() && stack.peek() == popped[index]){
                stack.pop();
                index++;
            }
        }
        return index == popped.length;
    }
}