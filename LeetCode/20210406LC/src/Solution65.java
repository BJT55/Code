class Solution65 {
    public int add(int a, int b) {
        if(b == 0)   // 若传入的进位为0,则返回
            return a;

        int m = ( a&b ) << 1; // 表示进位
        int n = a^b;  // 表示无进位情况
        return add(n,m);
    }
}