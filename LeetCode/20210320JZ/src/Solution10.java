class Solution10 {
    public int fib(int n) {
        if(n == 0 || n == 1)
            return n;

        int a = 0,b = 1,c = 0;
        for(int i = 2; i <= n; ++i){
            c = (a + b)%1000000007;
            a = b;
            b = c;
        }
        return c;
    }
}