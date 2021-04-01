import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution48 {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        int i = 0, max = 0;
        while(i < c.length){
            if(!queue.contains(c[i])){
                queue.add(c[i]);
                i++;
            }else{
                max = Math.max(queue.size(),max);
                while(queue.contains(c[i])){
                    queue.poll();
                }
            }
        }
        max = Math.max(max, queue.size());
        return max;
    }

    private int lengthOfLongestSubstring02(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0, tmp = 0;
        for (int j = 0; j < s.length(); ++j){
            int i = map.getOrDefault(s.charAt(j),-1);
            map.put(s.charAt(j),j);
            tmp = tmp < j-i ? tmp+1 : j-i;
            res = Math.max(res,tmp);
        }
        return res;
    }

    private int lengthOfLongestSubstring03(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = -1, res = 0;
        for (int j = 0; j < s.length(); ++j){
            if (map.containsKey(s.charAt(j)))
                i = Math.max(i,map.get(s.charAt(j)));
            map.put(s.charAt(j),j);
            res = Math.max(res, j - 1);
        }
        return res;
    }
}