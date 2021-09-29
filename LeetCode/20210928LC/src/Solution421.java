import java.util.HashSet;
import java.util.Set;

public class Solution421 {
    static final  int highBit = 30;

    public int findMaximumXOR(int[] nums) {
        int x = 0;
        for (int k = highBit; k >= 0; k--){
            Set<Integer> set = new HashSet<>();
            for (int n : nums){
                set.add(n>>k);
            }

            int xNext = x*2+1;
            boolean found = false;
            for (int n : nums){
                if (set.contains(xNext^(n>>k))){
                    found = true;
                    break;
                }
            }

            if (found) x = xNext;
            else x = xNext-1;
        }
        return x;
    }
}
