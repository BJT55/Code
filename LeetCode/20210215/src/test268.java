import java.util.Arrays;

public class test268 {
}

/*
// 方法一：
class Solution268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int i = 0;
        for(; i < nums.length; ++i){
            sum += nums[i] - i;
        }
        sum -= i;
        return Math.abs(sum);
    }
}*/

/*
// 方法二：
class Solution268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for(; i < nums.length; ++i){
            if(nums[i] != i) return i;
        }
        return i;
    }
}*/

// 方法三： 位运算(最快)
class Solution268 {
    public int missingNumber(int[] nums) {
        int ret = nums.length;
        for(int i = 0; i < nums.length; ++i){
            ret ^= i ^ nums[i];
        }
        return ret;
    }
}