import java.util.Stack;

public class JZ21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length != popA.length){
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i : popA) {
            while ( true ) {
                if (!stack.isEmpty() &&  stack.peek() == i){
                    stack.pop();
                    break;
                }else {
                    if (index < pushA.length){
                        stack.push(pushA[index]);
                        index++;
                    }else {
                        break;
                    }
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
