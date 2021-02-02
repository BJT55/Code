//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//你可以按任意顺序返回答案。

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test01 {
    public static void main(String[] args) {
        int[] nums1 = {0,3,5,6,7};
        int[] nums2 = {1,3,4,7,8,10};
        System.out.println(Arrays.toString(twoSum1(nums1,6)));
        System.out.println(Arrays.toString(twoSum2(nums2,10)));
    }

    // 方法一 暴力枚举：
    public static int[] twoSum1(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target){
        Map<Integer,Integer> hashTalbe = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (hashTalbe.containsKey(target - nums[i])) {
                return new int[] {hashTalbe.get(target - nums[i]) , i};
            }
            hashTalbe.put(nums[i], i);
        }
        return new int[0];
    }
}
