import java.util.Scanner;

public class Day30_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int res = 0;
            for (int i = 2; i <= Math.sqrt(n); ++i){
                if ( n%i == 0 ){
                    while ( n%i == 0){
                        n /= i;
                    }
                    res++;
                }
            }
            if (n != 1){
                res++;
            }
            System.out.println(res);
        }
    }
}
