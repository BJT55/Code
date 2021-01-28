package Day02;
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它
//将会被按顺序插入的位置,你可以假设数组中无重复元素
public class test05 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,12,18};
        Solution sl = new Solution();
        System.out.println(sl.searchInsert(arr,9));
        System.out.println(sl.searchInsert(arr,2));

    }

    static class Solution{
        public int searchInsert(int[] nums, int target){
            int temp = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i] == target){
                    return i;
                }
                if ( target > nums[i]){
                    temp = i + 1;
                }
            }
            return temp;
        }
    }

}

