package Day10;
// 34:
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。
//找出给定目标值在数组中的开始位置和结束位置。
//如果数组中不存在目标值 target，返回 [-1, -1]。

import java.util.Arrays;

public class test05 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target){
        int[] arr = {-1,-1};
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if ( nums[i] == target ){
                if (count == 0){
                    arr[0] = i;
                }
                arr[1] = i;
                count++;
            }
        }
        return arr;
    }


}
