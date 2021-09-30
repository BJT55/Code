public class Solution441 {
    public int arrangeCoins(int n) {
        if(n == 0 || n == 1) return n;
        int res = 0;
        int level = 1;
        while (n >= level){
            n -= level;
            res++;
            level++;
        }
        return res;
    }
}
