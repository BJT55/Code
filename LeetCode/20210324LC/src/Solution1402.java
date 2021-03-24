class Solution1402 {
    public int cuttingRope(int n) {
        if(n < 2)
            return 0;
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;

        long ret = 1;
        while(n > 4){
            ret *= 3;
            ret = ret % 1000000007;
            n -= 3;
        }
        return (int)((ret * n)% 1000000007);
    }
}