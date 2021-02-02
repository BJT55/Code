//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
//如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//你可以假设数组中无重复元素。
public class test35 {
    public static void main(String[] args) {
        Solution35 s = new Solution35();
        int[] nums = {1};
        int target = 2;
        System.out.println(s.searchInsert(nums,target));
    }

}

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length - 1; i++){
            if (target > nums[i] && target < nums[i + 1]){
                return i + 1;
            }else if (target <= nums[i]){
                return i;
            }
        }
        if (nums[i] >= target){
            return i;
        }
        return i + 1;
    }
}