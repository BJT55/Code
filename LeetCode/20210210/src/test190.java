//颠倒给定的 32 位无符号整数的二进制位
public class test190 {
    public static void main(String[] args) {

    }
}

class Solution190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            int bit = n & 1;
            n = n >> 1;
            result = (result<<1) + bit;
        }
        return result;
    }
}
