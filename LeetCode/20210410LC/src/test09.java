import java.util.Stack;

class CQueue09 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public void CQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        if(stack1.isEmpty()){
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        return stack2.pop();
    }
}
