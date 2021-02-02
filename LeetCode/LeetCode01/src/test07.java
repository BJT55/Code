//给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
//如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
//假设环境不允许存储 64 位整数（有符号或无符号）。

public class test07 {
    public static void main(String[] args) {
        int x = 1534236469;
        Solution7 s = new Solution7();
        System.out.println(s.reverse(x));
    }
}

class Solution7 {
    public int reverse(int x) {
        long num = 0;
        while (x != 0){
            num = num * 10 + x % 10;
            x /= 10;
        }
        return (int)num == num ? (int)num : 0;
    }
}
