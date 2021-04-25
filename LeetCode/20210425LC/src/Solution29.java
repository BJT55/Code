class Solution29 {
    public static int divide(int dividend, int divisor) {
        if (dividend == 0)
            return 0;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign; // 正负符号
        sign = (dividend ^ divisor) < 0;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        int res = 0;
        for (int i = 31; i >= 0; --i){
            if ((a>>i) >= b){
                res += 1<<i; // 结果加 2^n
                a -= b<<i; //除数减去 2^n * divisor
            }
        }
        return sign ? -res : res;
    }
}