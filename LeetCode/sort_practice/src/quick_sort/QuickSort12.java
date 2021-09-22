package quick_sort;

public class QuickSort12 {
    public static void main(String[] args) {
        int[] nums = {3,54,6,12,32,89,23,44,90,0};
        quickSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void quickSort(int[] nums) {
        quick(nums,0,nums.length-1);
    }

    private static void quick(int[] nums, int i, int j) {
        if (i >= j) return;

        int left = i, right = j;
        int bound = nums[i];
        while (left < right){
            while (left < right && nums[right] >= bound){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] <= bound){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = bound;

        quick(nums, i, left-1);
        quick(nums,left+1,j);
    }

    /**
     *
     * 快速排序: 每次选择待排区间的第一个作为基准值,将区间内比他小的放在基准值左边,比他大的放在基准值右边,让将基准值放在中间
     *
     * 分治思想
     * 时间复杂度: O(nlog2n)
     * 空间复杂度: O(log2n)
     * 不稳定
     */

}
