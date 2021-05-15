import java.util.Scanner;

public class Day18_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(rabbits(n));
        }
    }
    public static int rabbits(int n){
        if (n <= 2){
            return 1;
        }
        n -= 2;
        int a = 1, b = 1, c = 0;
        while (n > 0){
            c = a+b;
            a = b;
            b = c;
            n--;
        }
        return c;
    }
}
