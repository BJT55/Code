public class Solution56_2 {
    public int singleNumber(int[] nums) {
        int[] k = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                k[i] += nums[i]&1;
                nums[i] >>= 1;
            }
        }

        int res = 0;
        for (int i = 31; i >= 0; i--) {
            res = res<<1;
            if (k[i]%3 == 1){
                res = (res | 1);
            }
        }
        return res;
    }
}
