import java.util.Stack;

class MinStack {
    Stack<Integer> stack, minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek() || minStack.peek().equals(val)){
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek() == minStack.peek()){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}