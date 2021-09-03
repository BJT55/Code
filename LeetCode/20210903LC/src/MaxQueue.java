import java.util.Deque;
import java.util.LinkedList;

class MaxQueue {
    Deque<Integer> max;
    Deque<Integer> queue;
    public MaxQueue() {
        max = new LinkedList<>();
        queue = new LinkedList<>();
    }

    public int max_value() {
        if (queue.isEmpty()) return -1;
        return max.peek();
    }

    public void push_back(int value) {
        queue.addLast(value);
        while (!max.isEmpty() && max.peekLast() < value){
            max.pollLast();
        }
        max.addLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        int val = queue.pop();
        if (max.peekFirst() == val){
            max.pollFirst();
        }
        return val;
    }
}
