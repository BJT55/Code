//给定一个排序数组，你需要在 原地 删除重复出现的元素，
//使得每个元素只出现一次，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在 原地 修改输入数组
//并在使用 O(1) 额外空间的条件下完成。

import java.util.Arrays;

public class test26 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = solution26.removeDuplicates(nums);
        for (int i = 0; i < len; i++){
            System.out.printf(nums[i] +" ");
        }
    }
}

// 自己解：
/*
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int index = 0;
        for (int j = i + 1; j < nums.length; j++){
            if (nums[i] == nums[j]){
                continue;
            }else {
                nums[index+1] = nums[j];
                index++;
                i = j;
            }
        }
        return index + 1;
    }
}*/

// 官方：
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}