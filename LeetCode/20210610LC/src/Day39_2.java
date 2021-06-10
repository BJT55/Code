import java.util.Scanner;
// 最长公共子序列
public class Day39_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String m = in.next();
            String n = in.next();
            System.out.println(LCS(m,n));
        }
    }

    private static int LCS(String m, String n) {
        int len1 = m.length();
        int len2 = n.length();

        int[][] dp = new int[len1+1][len2+1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (m.charAt(i-1) == n.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
