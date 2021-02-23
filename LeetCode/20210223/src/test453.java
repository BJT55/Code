import java.util.Arrays;

public class test453 {

}
/*
// 方法一：排序
class Solution453 {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = nums.length - 1; i > 0; --i){
            count += nums[i] - nums[0];
        }
        return count;
    }
}
*/

/*
// 同下例代码，但耗时长（排序）
class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; ++i){
            count += nums[i];
        }
        return count - nums[0] * nums.length;
    }
}*/
class Solution453 {
    public int minMoves(int[] nums) {
        int move = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; ++i){
            move += nums[i];
            min = Math.min(nums[i],min); // 找到最小值
        }
        return move - min * nums.length;
    }
}