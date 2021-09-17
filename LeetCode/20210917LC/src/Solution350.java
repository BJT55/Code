import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int n : nums1){
            list1.add(n);
        }
        for (int n : nums2){
            if (list1.contains(n)){
                list2.add(n);
                list1.remove(Integer.valueOf(n));
            }
        }
        int[] res = new int[list2.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list2.get(i);
        }
        return res;
    }
}
