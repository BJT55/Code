//编写一个函数，输入是一个无符号整数（以二进制串的形式）
//返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
public class test191 {
    public static void main(String[] args) {
        Solution191 s = new Solution191();
        int n = 7;
        Integer.toBinaryString(n);
        System.out.println(s.hammingWeight(n));
    }
}

class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if( (n & 1) == 1){
                // n & 1 可以得到 n 的最后一位值，若为1，则count++
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
