import java.util.Scanner;

public class Day16_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int res = 0;
            for (int i = 2; i <= n; ++i){
                int sum = 0;
                for (int j = 2; j*j <= i; ++j){
                    if (i % j == 0){
                        if (i/j != j){
                            sum += (j + i/j);
                        }else {
                            sum += j;
                        }
                    }
                }
                if (sum+1 == i){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
