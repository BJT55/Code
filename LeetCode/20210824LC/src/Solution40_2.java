import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution40_2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0){
            return new int[0];
        }

        // 降序排序
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int num : arr){
            if (queue.size() < k){
                queue.add(num);
            }else if (queue.peek() > num){
                queue.poll();
                queue.add(num);
            }
        }

        // 返回数组
        int[] res = new int[queue.size()];
        int index = 0;
        for (int num : queue){
            res[index++] = num;
        }
        return res;
    }
}
