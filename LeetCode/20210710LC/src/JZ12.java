public class JZ12 {
    public double Power(double base, int exponent) {
        if(exponent < 0){
            base = 1.0/base;
            exponent = -exponent;
        }
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1 || exponent == -1){
            return base;
        }

        double tmp = base;
        for(int i = 2; i <= exponent; ++i){
            base = base * tmp;
        }
        return base;
    }

    public double Power_02(double base, int exponent) {
        if(exponent < 0){
            base = 1.0/base;
            exponent = -exponent;
        }

        double tmp = base;
        double res = 1.0;
        while (exponent>0){
            if ((exponent&1) > 0){
                res *= tmp;
            }
            tmp *= tmp;
            exponent >>= 1;
        }
        return res;
    }
}
