public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int len = timeSeries.length;
        if (len == 0) return 0;

        int res = 0;
        for (int i = 0; i < len-1; i++){
            res += Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        return res + duration;
    }
}
