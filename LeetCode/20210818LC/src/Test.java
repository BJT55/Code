import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(9);
        queue.add(4);
        queue.add(2);
        queue.add(6);
        queue.add(1);
        queue.add(-3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
