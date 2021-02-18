public class test342 {

}

/*
// 方法一：
class Solution342 {
    public boolean isPowerOfFour(int n) {
        return ( Math.log10(n) / Math.log10(4) ) % 1 == 0;
    }
}*/

// 方法二：
class Solution342 {
    public boolean isPowerOfFour(int n) {
        return ( n>0 ) && ((n & (n-1)) == 0) && (n%3 == 1);
    }
}
