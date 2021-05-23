import java.util.Scanner;

public class Day31_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            StringBuilder res = new StringBuilder();
            res.append(n+" = ");
            for (int i = 2; i <= Math.sqrt(n); ++i){
                while ( (n%i == 0) && (n != i)){
                    n /= i;
                    res.append(i+" * ");
                }
            }
            res.append(n);
            System.out.println(res.toString());
        }
    }
}
