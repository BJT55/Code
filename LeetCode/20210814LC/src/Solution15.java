public class Solution15 {
    public int hammingWeight(int n) {
        int res = 0;
        while ( n > 0){
            res++;
            n = (n-1)&n;
        }
        return res;
    }
    public int hammingWeight02(int n) {
        int res = 0;
        int tmp = 1;
        while (tmp != 0){
            if ((n&tmp) == 1){
                res++;
            }
            tmp <<= 1;
        }
        return res;
    }
}
