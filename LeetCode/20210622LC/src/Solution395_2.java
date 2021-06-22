// 滑动窗口
public class Solution395_2 {
    public int longestSubstring(String s, int k) {
        int res = 0;
        int n = s.length();
        for (int i = 1; i <= 26; i++) {
            int left = 0, right = 0;
            int[] count = new int[26];
            int total = 0, less = 0;
            while (right < n){
                int index1 = count[s.charAt(right) - 'a'];
                index1++;
                if (count[index1] == 1){
                    total++;
                    less++;
                }
                if (count[index1] == k){
                    less--;
                }

                while (total > i){
                    int index2 = count[s.charAt(left) - 'a'];
                    index2++;
                    if (count[index2] == k-1){
                        less++;
                    }
                    if (count[index2] == 0){
                        total--;
                        less--;
                    }
                    left++;
                }
                if (less == 0){
                    res = Math.max(res,right-left+1);
                }
                right++;
            }
        }
        return res;
    }
}
