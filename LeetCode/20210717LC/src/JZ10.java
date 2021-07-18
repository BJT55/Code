public class JZ10 {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        int a = 0, b = 1;
        n -= 1;
        while(n-- > 0){
            int tmp = b;
            b = (a+b)%1000000007;
            a = tmp;
        }
        return b;
    }
}
