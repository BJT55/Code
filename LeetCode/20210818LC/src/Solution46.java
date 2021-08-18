public class Solution46 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= s.length(); i++){
            String tmp = s.substring(i-2,i);
            if (tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0){
                dp[i] = dp[i-1] + dp[i-2];
            }else {
                dp[i] = dp[i-1];
            }
        }
        return dp[dp.length-1];
    }

    public int translateNum02(int num) {
        if (num <= 9) return 1;
        int number = num%100;
        if (number<=9 || number>=25)
            return translateNum02(num/10);
        else
            return translateNum02(num/10)+translateNum02(num/100);
    }
}
