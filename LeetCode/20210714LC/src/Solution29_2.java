import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution29_2 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> res = new ArrayList<>();
        if (k == 0 || input.length < k){
            return res;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 降序排序
                return o2-o1;
            }
        });
        for (int i = 0; i < k; i++) {
            queue.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            if (input[i] < queue.peek()){
                queue.poll();
                queue.add(input[i]);
            }
        }

        while ( !queue.isEmpty()){
            res.add(0,queue.poll());
        }
        return res;
    }
}
