import java.util.Deque;
import java.util.LinkedList;

public class Solution59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return nums;

        Deque<Integer> deque = new LinkedList<>();
        int[] arr = new int[nums.length-k+1];
        int index = 0;

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.peekLast()){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (deque.peekFirst() == nums[i-k])
                deque.removeFirst();

            while (!deque.isEmpty() && nums[i] > deque.peekLast()){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            arr[index++] = deque.peekFirst();
        }
        return arr;
    }
}
