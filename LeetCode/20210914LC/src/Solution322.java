public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;

        return coinHelp(coins,amount,new int[amount]);
    }

    private int coinHelp(int[] coins, int tmp, int[] count) {
        if (tmp < 0) return -1;

        if (tmp == 0) return 0;

        if (count[tmp-1] != 0) return count[tmp-1];

        int min = Integer.MAX_VALUE;
        for (int coin : coins){
            int res = coinHelp(coins,tmp-coin,count);
            if (res >= 0 && res < min){
                min = res+1;
            }
        }
        count[tmp-1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[tmp-1];
    }
}
