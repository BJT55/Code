import java.util.Scanner;

public class Day25_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            for (int i = 0; i < n; ++i){
                int x = in.nextInt();
                System.out.print(interstellarCode(x));
            }
            System.out.println();
        }
    }
    public static int interstellarCode(int x){
        int  a = 0, b = 1, c = 0;
        for (int i = 0; i < x; ++i){
            c = a + b;
            a = b % 10000;
            b = c % 10000;
        }
        return c % 10000;
    }
}
