public class Solution461 {
    public int hammingDistance(int x, int y) {
        int res = 0;
        int tmp = x^y;
        while (tmp != 0){
            res += tmp&1;
            tmp >>= 1;
        }
        return res;
    }
}
