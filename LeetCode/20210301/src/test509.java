public class test509 {
}

/*
// 10ms
class Solution509 {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
}*/


// 0ms
class Solution509 {
    public int fib(int n) {
        if(n <= 1) return n;
        int a = 0,b = 0,c = 1;
        for(int i = 2; i <= n; ++i){
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}