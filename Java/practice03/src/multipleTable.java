import java.util.Scanner;
//根据输入的n打印n*n的乘法表
public class multipleTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for ( int i = 1; i <= num; i++){
            for ( int j = 1; j <= i; j++){
                System.out.print( j + "*" + i + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
}
