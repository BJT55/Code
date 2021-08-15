public class Solution17 {
    public int[] printNumbers(int n) {
        int len = (int)Math.pow(10,n);
        int[] res = new int[len-1];
        for (int i = 0; i < len-1; i++){
            res[i] = i;
        }
        return res;
    }
}
