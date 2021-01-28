package Day09;
// 给定一个整数数组 nums 和一个整数目标值 target，
// 请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

import java.util.Arrays;

public class test04 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
