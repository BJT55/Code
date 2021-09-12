import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0]-o1[0] : o2[1]-o1[1];
            }
        });

        for (int i = 0; i < k; i++) {
            queue.offer(new int[]{nums[i],i});
        }

        int[] res = new int[len-k+1];
        res[0] = queue.peek()[0];
        for (int i = k; i < len; i++){
            queue.offer(new int[]{nums[i], i});
            while (queue.peek()[1] <= i-k){
                queue.poll();
            }
            res[i-k+1] = queue.peek()[0];
        }
        return res;
    }
}
