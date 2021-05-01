import java.util.Scanner;

public class Day07_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1;
        while (n > b){
            int c = a+b;
            a = b;
            b = c;
        }
        // 退出循环
        int ret = Math.min(n-a,b-n);
        System.out.println(ret);
    }
}
