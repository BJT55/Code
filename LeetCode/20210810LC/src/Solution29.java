public class Solution29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        int res = 0;
        boolean sign = true;
        if( (dividend < 0 && divisor > 0) || dividend > 0 && divisor < 0){
            sign = false;
        }
        long dd = Math.abs(dividend);
        long dr = Math.abs(divisor);

        for (int i = 31; i >= 0; i--){
            if ( (dd>>i) >= dr){
                // 找出足够大的数 2^n*divisor
                res += 1<<i;  //将结果加上2^n
                dd -= dr<<i;  //将被除数减去2^n*divisor
            }
        }
        return sign ? res : -res;
    }
}
