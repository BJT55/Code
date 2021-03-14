public class test746 {
}

class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int pre = 0, cur = 0;
        for(int i = 2; i <= cost.length; ++i){
            int next = Math.min( pre + cost[i-2], cur + cost[i-1]);
            pre = cur;
            cur = next;
        }
        return cur;
    }
}