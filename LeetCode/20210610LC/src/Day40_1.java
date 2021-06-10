import java.util.Scanner;
// 发邮件
public class Day40_1 {
    public static void main(String[] args) {
        long[] dp = new long[21];
        dp[2] = 1;
        for (int i = 3; i < 21; i++) {
            dp[i] = (i-1)*(dp[i-1]+dp[i-2]);
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(dp[n]);
        }
    }
}
