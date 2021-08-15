public class Solution16 {
    public double myPow(double x, int n) {
        double res = 1.0;
        long nn = n;
        if (nn < 0){
            x = 1/x;
            nn = -nn;
        }

        while (nn != 0){
            if ((nn&1) != 0){
                res *= x;
            }
            x *= x;
            nn >>= 1;
        }
        return res;
    }
}
