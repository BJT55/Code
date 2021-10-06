import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < len2; i++) {
            while (!stack.isEmpty() && stack.peekLast() < nums2[i]){
                map.put(stack.removeLast(),nums2[i]);
            }
            stack.addLast(nums2[i]);
        }

        int[] res = new int[len1];
        for (int i = 0; i < len1; i++){
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}
