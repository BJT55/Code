import java.util.HashMap;
import java.util.Map;

class Solution56 {
    public int[] singleNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int i = 0;
        for(int num : nums){
            if(map.get(num) == 1){
                res[i++] = num;
            }
        }
        return res;
    }

    public int[] singleNumbers02(int[] nums) {
        int tmp = 0; // a b 的异或结果
        for(int num : nums){
            tmp ^= num;
        }

        int index = (-tmp)&tmp;  // a b 二进制为1的最低位是 index
        int[] res = new int[2];    //根据index位置的0/1,将数组分为两组
        for(int num : nums){
            if((index&num) == 0){
                // 表示 index 为 0
                res[0] ^= num;
            }else {
                // 表示 index 为 1
                res[1] ^= num;
            }
        }
        return res;
    }
}
