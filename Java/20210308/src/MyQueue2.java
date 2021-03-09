// 用数组来表示队列：
public class MyQueue2 {
    private int[] data = new int[100];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    // 核心操作：
    // 1.入队列
    public boolean offer(int val){
        if (size == data.length){
            return false;
        }
        data[head] = val;
        tail++;
        // 如果 tail 到达末尾
        if (tail == data.length){
            tail = 0;
        }
        size++;
        return true;
    }
    // 2.出队列
    public Integer poll(){
        if (size == 0){
            return null;
        }
        int ret = data[head];
        head++;
        // 如果 head 到达末尾
        if (head == data.length){
            head = 0;
        }
        size--;
        return ret;
    }
    // 3.取队列首元素
    public Integer peek(){
        if (size == 0){
            return null;
        }
        return data[head];
    }
}
