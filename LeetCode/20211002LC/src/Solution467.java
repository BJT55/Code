public class Solution467 {
    public int findSubstringInWraproundString(String p) {
        int n = p.length();
        if (n < 1) return 0;

        int res = 0;
        int[] count = new int[26];
        char[] c = p.toCharArray();
        int curMaxLen = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && (c[i]-c[i-1] == 1 || c[i-1]-c[i] == 25)){
                curMaxLen++;
            }else {
                curMaxLen = 1;
            }

            count[c[i]-'a'] = Math.max(count[c[i]-'a'],curMaxLen);
        }
        for (int tmp : count){
            res += tmp;
        }
        return res;
    }
}
