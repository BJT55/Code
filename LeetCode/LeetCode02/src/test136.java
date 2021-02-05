import java.util.Arrays;

//给定一个非空整数数组，除了某个元素只出现一次以外，
//其余每个元素均出现两次。找出那个只出现了一次的元素。
public class test136 {

}

// 官方：采用异或的方法判断（不得不说这解法太聪明了）
// 解释：
// a ^ 0 = a,
// a ^ a = 0,
// a ^ b ^ c ^ a = (a ^ a) ^ b ^ c
class Solution136 {
    public int singleNumber(int[] nums) {
        int tmp = 0;
        for(int x : nums){
            tmp ^= x;
        }
        return tmp;
    }
}

/*

// 自己：7ms 太慢了
class Solution136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int tmp = 0;
        if (nums.length == 1){
            return nums[0];
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                tmp = nums[i];
                break;
            }else{
                i += 1;
            }
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]){
            return nums[nums.length - 1];
        }
        return tmp;
    }
}*/
