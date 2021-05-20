import java.util.Scanner;

public class Day23_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            System.out.println(levenshteinDistance(str1,str2));
        }
    }
    public static int levenshteinDistance(String str1, String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int len1 = c1.length;
        int len2 = c2.length;

        int[][] dp = new int[len1+1][len2+1];

        for (int i = 0; i <= len1; ++i){
            dp[i][0] = i;
        }
        for (int i = 0; i <= len2; ++i){
            dp[0][i] = i;
        }

        for (int i = 1; i <= len1; ++i){
            for (int j = 1; j <= len2; ++j){
                //求插入和删除的最小值
                dp[i][j] = Math.min( dp[i-1][j], dp[i][j-1])+1;
                //再和替换比较求最小值
                if (c1[i-1] == c2[j-1]){
                    // 相等时不需要替换
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]);
                }else {
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]+1);
                }
            }
        }
        return dp[len1][len2];
    }
}
