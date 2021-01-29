public class test01 {
    public static void main(String[] args) {
//        int ret = factorial(5);
//        System.out.println(ret);

        int ret = fib(5);
        System.out.println(ret);
    }

    // 递归求阶乘
    public static int factorial(int n){
        if (n < 2){
            return n;
        }
        return factorial(n - 1) * n;
    }

    // 斐波那契数列
    public static int fib(int n){
        if (n <= 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
