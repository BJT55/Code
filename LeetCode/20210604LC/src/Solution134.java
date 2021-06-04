class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = 0, run = 0, start = 0;
        for (int i = 0; i < gas.length; ++i){
            run += (gas[i] - cost[i]);
            res += (gas[i] - cost[i]);
            if (run < 0){
                start = i + 1;
                run = 0;
            }
        }
        return res < 0 ? -1 : start;
    }
}