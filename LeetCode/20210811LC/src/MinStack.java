import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(min.isEmpty()){
            min.push(x);
        }else{
            Integer minValue = Math.min(x,min.peek());
            min.push(minValue);
        }
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
        if(!min.isEmpty()){
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}