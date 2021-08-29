public class Solution56_1 {
    public int[] singleNumbers(int[] nums) {
        int res = 0; // 俩个出现一次的值的异或
        for (int n : nums){
            res ^= n;
        }

        int div = 1; // res 二进制中第一个 1 的位置, 根据其进行分组
        while ( (div & res) == 0){
            div <<= 1;
        }

        int a = 0, b = 0;
        for (int n : nums){
            //第一组 异或不为1
            if ((div&n) == 0){
                a ^= n;
            }else {
                //第二组 异或为1
                b ^= n;
            }
        }
        return new int[]{a,b};
    }
}