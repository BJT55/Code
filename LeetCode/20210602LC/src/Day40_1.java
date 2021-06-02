import java.util.Scanner;

public class Day40_1 {
    public static void main(String[] args) {
        long[] dp = new long[21];
        dp[2] = 1;
        for (int i = 3; i <= 20; ++i){
            dp[i] = (i-1)*(dp[i-1]+dp[i-2]);
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if (n == 1 || n == 0){
                System.out.println(0);
            }
            else if (n == 2){
                System.out.println(1);
            }
            else System.out.println(dp[n]);
        }
    }
}
