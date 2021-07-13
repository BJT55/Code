import java.util.Stack;

public class JZ20 {
    Stack<Integer> num = new Stack<>();
    Stack<Integer> minNum = new Stack<>();

    public void push(int node) {
        if (minNum.isEmpty()){
            minNum.push(node);
        }else{
            minNum.push(Math.min(minNum.peek(),node));
        }
        num.push(node);
    }

    public void pop() {
        num.pop();
        minNum.pop();
    }

    public int top() {
        return num.peek();
    }

    public int min() {
        return minNum.peek();
    }
}
