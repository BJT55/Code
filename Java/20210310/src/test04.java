import java.util.Stack;

public class test04 {
}

class MinStack{
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    public MinStack(){

    }

    public void push(int x){
        A.push(x);
        // 比较 x 和 B的栈顶 谁小谁入栈
        if (B.isEmpty())
            B.push(x);
        int min = B.peek();
        if (x < min){
            min = x;
        }
        B.push(min);
    }

    public void pop(){
        if (A.isEmpty()){
            return;
        }
        A.pop();
        B.pop();
    }

    public int top(){
        if (A.isEmpty())
            return 0;
        return A.peek();
    }

    public int getMin(){
        if (B.isEmpty())
            return 0;
        return B.peek();
    }
}