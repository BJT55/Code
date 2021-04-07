class Solution67 {
    public int strToInt(String str) {
        char[] c = str.trim().toCharArray();
        if(c.length == 0)
            return 0;

        int res = 0;
        int max = Integer.MAX_VALUE/10;
        int i = 1, sign = 1;
        // 判断正负
        if(c[0] == '-')
            sign = -1;
        else if(c[0] != '+')
            i = 0;

        for (int j = i; j < c.length; ++j){
            // 当遇到非数字时停止循环
            if (c[j] < '0' || c[j] > '9'){
                break;
            }
            if (res > max || res == max && c[j] > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            res = res * 10 + (c[j] - '0');
        }
        return sign * res;
    }
}