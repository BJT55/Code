import java.util.Scanner;
//求两个整数之间的最大公约数
public class commonDivisor {
    public static int num(int a,int b){
        while ( a % b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+"和"+b+"的最大公约数为"+num(a,b));
    }
}
