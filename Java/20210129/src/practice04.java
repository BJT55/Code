public class practice04 {
    //递归求 N 的阶乘
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if ( n == 1){
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
