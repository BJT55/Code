class Solution10_2 {
    public int numWays(int n) {
        int a = 1, b = 1;
        for(int i = 1; i < n; ++i){
            b = a+b;
            a = b - a;
            b %= 1000000007;
        }
        return b;
    }
}