public class test16 {
    public double myPow(double x, int n){
        if (x == 0)
            return 0;

        long count = n;
        double res = 1.0;
        if (n < 0){
            x = 1/x;
            count = -count;
        }

        while (count>0){
            if ((count&1) == 1)
                res *= x;
            x *= x;
            count >>= 1;
        }
        return res;
    }
}
