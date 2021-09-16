public class Solution338 {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0 ; i <= n; i++){
            int num = i;
            int count = 0;
            while (num != 0){
                num = (num-1)&num;
                count++;
            }
            res[i] = count;
        }
        return res;
    }
}
