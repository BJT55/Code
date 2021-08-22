import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String[] s = in.nextLine().split(",");
            int[] num = new int[s.length];
            for (int i = 0; i < s.length; i++){
                num[i] = Integer.parseInt(s[i]);
            }

            int[] dp1 = new int[num.length];
            int[] dp2 = new int[num.length];
            dp1[0] = dp2[0] =0;
            int res = 0;
            for (int i = 1; i < dp1.length; i++){
                if (num[i]-num[i-1]>=0) {
                    dp1[i] = dp1[i - 1] + num[i] - num[i-1];
                }else {
                    dp2[i] = dp2[i - 1] + num[i-1] - num[i];
                }
                int tmp = Math.max(dp1[i],dp2[i]);
                res = Math.max(res,tmp);
            }
            System.out.println(res);
        }
    }
}
