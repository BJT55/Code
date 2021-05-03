import java.util.Scanner;

public class Day10_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1, c = 1;
        while (c < n){
            a = b;
            b = c;
            c = a+b;
        }
        System.out.println(Math.min(c-n,n-b));
    }
}
