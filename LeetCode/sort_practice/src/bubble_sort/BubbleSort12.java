package bubble_sort;

public class BubbleSort12 {
    public static void main(String[] args) {
        int[] nums = {3,54,66,12,32,89,23,44,90,0};
        bubble(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }

    /**
     *
     * 冒泡排序: 在无序区间,通过对两个相邻的元素进行比较, 将较大元素/较小 放到无序区间的后面/前面,重复步骤
     * 时间复杂度: O(n2)
     * 空间复杂度: O(1)
     * 稳定
     */

    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
