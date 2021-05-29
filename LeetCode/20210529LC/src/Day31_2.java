import java.util.Scanner;

public class Day31_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            String res = n + " = ";
            for (int i = 2; i * i <= n; ++i){
                while ( n%i == 0){
                    res += i;
                    n /= i;
                    if (n != 1){
                        res += " * ";
                    }
                }
            }
            if (n != 1){
                res += n;
            }
            System.out.println(res);
        }
    }
}
