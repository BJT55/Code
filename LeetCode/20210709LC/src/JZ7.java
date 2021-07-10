public class JZ7 {
    public int Fibonacci_1(int n) {
        if(n <= 1){
            return n;
        }

        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= n; ++i){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public int Fibonacci_2(int n) {
        int[] dp = new int[40];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; ++i){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
