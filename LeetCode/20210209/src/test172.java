//给定一个整数 n，返回 n! 结果尾数中零的数量。
public class test172 {
    public static void main(String[] args) {
        int n = 10;
        Solution172 s = new Solution172();
        System.out.println(s.trailingZeroes(n));
    }
}

// 对于一个整数来说，如果阶乘有0，则其因子数必含有（ 2 * 5 ）
// 由于 2 的数量比 5 的数量多，因此只需要知道 5 的个数有多少个就可得出尾数中 0 的数量
class Solution172 {
    public int trailingZeroes(int n) {
        if(n < 5) return 0;
        int count = 0;
        while( n >= 5){
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
