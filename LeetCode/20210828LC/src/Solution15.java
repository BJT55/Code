public class Solution15 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            n = (n-1)&n;
            res++;
        }
        return res;
    }
}