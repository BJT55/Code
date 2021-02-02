//给你一个数组nums和一个值val,你需要原地移除所有数值等于val的元素,并返回移除后数组的新长度。
//不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

import java.util.Arrays;

public class test27 {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        int[] nums = {1};
        s.removeElement(nums,1);
        System.out.println(Arrays.toString(nums));
    }

}

class Solution27 {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}