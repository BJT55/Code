import java.util.Scanner;
//求二进制中1的个数
public class binaryOne {
    public static int binaryOneNum(int n){
        int count = 0;
        while ( n != 0){
            if ( (n & 1) == 1){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num+"的二进制中1的个数为："+binaryOneNum(num));
    }
}
