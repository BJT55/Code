import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0)
            return new ArrayList<>();

        PriorityQueue<int[]> heap = new PriorityQueue<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                heap.add(new int[]{nums1[i],nums2[j]});
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        while (k > 0 && !heap.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int[] arr = heap.poll();
            list.add(arr[0]);
            list.add(arr[1]);
            res.add(list);
            k--;
        }
        return res;
    }
}
