import java.util.Scanner;
//求 N 的阶乘
public class test06 {
    public static int fac(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("N 的阶乘为："+fac(n));
    }
}
