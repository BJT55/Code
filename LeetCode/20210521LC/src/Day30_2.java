import java.util.Scanner;

public class Day30_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int res = 0;
            for (int i = 2; i < Math.sqrt(n); ++i){
                boolean flag = false;
                while (n % i == 0){
                    flag = true;
                    n /= i;
                }
                if (flag){
                    res++;
                }
                if (n == 1){
                    break;
                }
            }
            if (n != 1){
                res++;
            }
            System.out.println(res);
        }
    }
}
