public class Solution395 {
    public int longestSubstring(String s, int k) {
        int len = s.length();
        return dfs(s,0,len-1,k);
    }

    private int dfs(String s, int left, int right, int k) {
        int[] count = new int[26];
        for (int i = left; i <= right; i++){
            count[s.charAt(i)-'a']++;
        }

        char split = 0;
        for (int i = 0; i < 26; i++){
            if (count[i] > 0 && count[i] < k){
                split = (char)(i+'a');
                break;
            }
        }
        if (split == 0){
            return right-left+1;
        }

        int i = left;
        int res = 0;
        while (i <= right){
            while (i <= right && s.charAt(i) == split){
                i++;
            }
            if (i > right){
                break;
            }
            int start = i;
            while (i <= right && s.charAt(i) != split){
                i++;
            }

            int length = dfs(s,start,i-1,k);
            res = Math.max(res,length);
        }
        return res;
    }
}
