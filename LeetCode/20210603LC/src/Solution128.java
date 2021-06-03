import java.util.HashSet;
import java.util.Set;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int longest = 0;
        for (int num : nums){
            if (set.remove(num)){
                int currentLongest = 1;
                int current = num;
                // 向左遍历
                while (set.remove(current-1)){
                    current--;
                }
                currentLongest += num-current;
                // 向右遍历
                current = num;
                while (set.remove(current+1)){
                    current++;
                }
                currentLongest += current-num;
                longest = Math.max(longest,currentLongest);
            }
        }
        return longest;
    }
}