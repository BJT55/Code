import java.util.Arrays;
// dfs+剪枝 (超时)
class Solution322 {
    public int minCount = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        dfs(coins,amount,0,coins.length-1);
        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }

    private void dfs(int[] coins, int amount, int count, int index) {
        if (index < 0 || count + amount/coins[index] >= minCount ){
            return;
        }

        if (amount % coins[index] == 0){
            minCount = Math.min(minCount, count + amount/coins[index]);
            return;
        }

        for (int i = amount/coins[index]; i >= 0; --i) {
            dfs(coins,amount-i*coins[index],count+i,index-1);
        }
    }

}