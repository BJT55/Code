import java.util.Scanner;
//求1！+2！+......+n！的和
public class test01 {
    public static int fac(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for ( int i = 1; i <= num; i++)
        {
            sum += fac(i);
        }
        System.out.println("sum = "+sum);
    }
}
