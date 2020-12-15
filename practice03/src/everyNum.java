import java.util.Scanner;
//输出一个整数的每一位
public class everyNum {
    public static void printNum(int num){
        if ( num > 9){
            printNum( num / 10 );
        }
        System.out.print(num % 10 + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printNum(num);
    }
}
