import java.util.Arrays;
import java.util.Scanner;

public class HJ103 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = Integer.parseInt(in.next());
            int[] num = new int[n];
            for(int i = 0; i < n; ++i){
                num[i] = Integer.parseInt(in.next());
            }

            int res = 1;
            int[] dp = new int[n];
            Arrays.fill(dp,1);
            for (int i = 1; i < n; ++i){
                for (int j = 0; j < i; ++j){
                    if (num[j] < num[i]){
                        dp[i] = Math.max(dp[i],dp[j]+1);
                    }
                }
            }
            for (int k : dp){
                res = Math.max(k,res);
            }
            System.out.println(res);
        }
    }
}
