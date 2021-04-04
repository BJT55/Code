class Solution56_1 {
    public int[] singleNumbers(int[] nums) {
        int tmp = 0;  // 两个单数异或结果
        for(int num : nums){
            tmp ^= num;
        }

        int[] res = new int[2];
        int index = (-tmp)&tmp;  // 根据第index的0/1分成两组
        for(int num : nums){
            if((num&index) == 0 ){
                // index位为0
                res[0] ^= num;
            }else{
                res[1] ^= num;
            }
        }
        return res;
    }
}