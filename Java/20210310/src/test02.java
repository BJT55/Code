import java.util.LinkedList;
import java.util.Queue;

public class test02{
}

class MyStack{
    private Queue<Integer> A = new LinkedList<>();
    private Queue<Integer> B = new LinkedList<>();//辅助

    public MyStack(){

    }

    public void push(int x){
        A.offer(x);
    }

    public int pop(){
        // 将A中元素放入B中，直到A中只剩下一个元素
        if (A.isEmpty() && B.isEmpty())
            return 0;
        while (A.size() > 1){
            int tmp = A.poll();
            B.offer(tmp);
        }
        int ret = A.poll();
        // 交换 A 和 B ，保证下次入栈时还是向 A中插入
        swap();
        return ret;
    }
    public void swap(){
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
    }

    public int top(){
        // 将A中元素放入B中，直到A中只剩下一个元素
        if (A.isEmpty() && B.isEmpty())
            return 0;
        while (A.size() > 1){
            int tmp = A.poll();
            B.offer(tmp);
        }
        int ret = A.poll();
        B.offer(ret);
        // 交换 A 和 B ，保证下次入栈时还是向 A中插入
        swap();
        return ret;
    }

    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}