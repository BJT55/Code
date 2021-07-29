public class Solution56_1 {
    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for(int n : nums){
            res ^= n;  // 得到两个只出现一次数的异或结果
        }

        // 记录 res 的第一个 1 在二进制的第几位(从右往左)
        int div = 1;
        while ((div&res) == 0){
            div <<= 1;
        }


        int a = 0, b = 0;
        for (int n : nums){
            if ((div&n) == 0){
                // 第一组
                a ^= n;
            }else {
                b ^= n;
            }
        }
        return new int[]{a,b};
    }
}
