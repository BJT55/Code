package Day05;

import java.util.Arrays;

// 给定一个整数数组，判断是否存在重复元素
// 如果任何值在数组中出现至少两次，函数返回true，如果数组中每个元素都不相同，则返回false
public class test04 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,4,6,7};
        int[] nums2 = {1,2,3,4,5,6,7};
        System.out.println(containDuplicate(nums1));
        System.out.println(containDuplicate(nums2));
    }

    public static boolean containDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
