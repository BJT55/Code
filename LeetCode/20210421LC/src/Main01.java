import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Solution(n));
    }
    public static int Solution(int n){
        int res = n;
        long a = 0, b = 1, c = 0;
        while (true){
            int tmp = (int) Math.abs(n-c);
            if(tmp > n) break;
            res = Math.min(res,tmp);
            c = a+b;
            a = b;
            b = c;
        }
        return res;
    }
}
