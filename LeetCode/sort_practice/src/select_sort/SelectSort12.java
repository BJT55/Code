package select_sort;

public class SelectSort12 {
    public static void main(String[] args) {
        int[] nums = {72,3,54,66,12,32,89,23,44,90,0};
        selectSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    swap(nums,i,j);
                }
            }
        }
    }

    /**
     * 选择排序:每次从无序区间中找到最小/最大的元素放入无序区间的最前/最后,直到所有元素都已排序完毕
     * 时间复杂度: O(N2)
     * 空间复杂度: O(1)
     * 不稳定
     */


    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
