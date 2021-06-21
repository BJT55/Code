import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution347_2 {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        Arrays.sort(nums);
        int index = 0;
        while (index < nums.length){
            int count = 1;
            while (index + 1 < nums.length && nums[index] == nums[index+1]){
                index++;
                count++;
            }

            if (pq.size() < k){
                pq.offer(new int[]{nums[index],count});
            }else if (pq.peek()[1] < count){
                pq.poll();
                pq.offer(new int[]{nums[index],count});
            }
            index++;
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
