public class Solution19 {
    public int maxsumofSubarray (int[] arr) {
        // write code here
        int max = arr[0];
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
