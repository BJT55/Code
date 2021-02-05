import java.util.Map;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
public class test53 {
    public static void main(String[] args) {
        Solution53 s = new Solution53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));
    }
}

class Solution53 {
    public int maxSubArray(int[] nums) {
        int temp = 0;
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (temp + nums[i] > nums[i]){
                temp += nums[i];
            }else temp = nums[i];
            if (temp > sum){
                sum = temp;
            }
        }
        return sum;
    }
}