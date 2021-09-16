public class Solution342 {
    public boolean isPowerOfFour(int n) {
        return n > 0 && ( n&(n-1)) == 0 && n%3 == 1;
    }

    public boolean isPowerOfFour_2(int n) {
        int x = 4;
        while (x > 0 && x < n){
            x <<= 2;
        }
        return n == 1 || n == x;
    }
}
