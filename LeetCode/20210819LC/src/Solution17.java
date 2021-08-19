public class Solution17 {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        int res = 0;
        char[] c = A.toCharArray();
        for (int i = 1; i < n; i++){
            res = Math.max(res,getCount(c,i,i));
            res = Math.max(res,getCount(c,i,i+1));
        }
        return res;
    }

    private int getCount(char[] c, int left, int right) {
        while (left >= 0 && right < c.length && c[left] == c[right]){
            left--;
            right++;
        }
        return right-left-1;
    }
}
