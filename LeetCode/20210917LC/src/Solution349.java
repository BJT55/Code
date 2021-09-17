import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1){
            set.add(n);
        }
        List<Integer> list = new ArrayList<>();
        for (int n : nums2){
            if (set.contains(n)){
                list.add(n);
                set.remove(n);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
