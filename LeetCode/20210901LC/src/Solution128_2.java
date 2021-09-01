import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution128_2 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
        }

        int res = 0;
        for (int n : set){
            if (!set.contains(n-1)){
                int curNum = n;
                int curLen = 1;

                while (set.contains(curNum+1)){
                    curLen += 1;
                    curNum += 1;
                }

                res = Math.max(res,curLen);
            }
        }
        return res;
    }
}
