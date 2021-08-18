import java.util.HashSet;
import java.util.Set;

public class Solution41 {
    public int maxLength (int[] arr) {
        // write code here
        int res = 0;
        Set<Integer> set = new HashSet<>();
        int start = 0;
        for (int end = 0; end < arr.length; end++){
            while (set.contains(arr[end])){
                set.remove(arr[start++]);
            }
            set.add(arr[end]);
            res = Math.max(res,end-start+1);
        }
        return res;
    }
}
