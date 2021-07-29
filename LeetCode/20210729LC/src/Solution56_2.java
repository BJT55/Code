public class Solution56_2 {
    public int singleNumber(int[] nums) {
        int[] k = new int[32];
        for(int n : nums){
            for(int j = 31; j >= 0; --j){
                k[j] += n & 1;
                n >>= 1;
            }
        }

        int res = 0;
        for(int i = 31; i >= 0; --i){
            if(k[i] % 3 == 1){
                res += Math.pow(2,31-i);
            }
        }
        return res;
    }
}
