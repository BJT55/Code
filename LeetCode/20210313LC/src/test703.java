import java.util.PriorityQueue;

public class test703 {
}

class KthLargest703 {
    PriorityQueue<Integer> queue;
    int k;

    public void KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        for (int x : nums){
            add(x);
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k){
            queue.poll();
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */