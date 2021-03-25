class Solution16 {
    public double myPow(double x, int n) {
        if (x == 0)
            return 0;
        long num = n;
        double ret = 1.0;
        if (num < 0){
            x = 1 / x;
            num = -num;
        }
        while (num > 0){
            if((num & 1) == 1)
                ret *= x;
            x *= x;
            num >>= 1;
        }
        return ret;
    }
}