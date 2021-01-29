public class practice01 {
    //递归求斐波那契数列的第 N 项
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n){
        if (n <= 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
