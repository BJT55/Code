public class Solution66 {
    public int[] constructArr(int[] a) {
        int[] dp = new int[a.length];

        int tmp = 1;
        for (int i = 0; i < a.length; i++) {
            dp[i] = tmp;
            tmp *= a[i];
        }

        tmp = 1;
        for (int i = a.length-1; i >= 0; i--){
            dp[i] *= tmp;
            tmp *= a[i];
        }

        return dp;
    }
}