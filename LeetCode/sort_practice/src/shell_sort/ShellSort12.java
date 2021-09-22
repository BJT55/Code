package shell_sort;

public class ShellSort12 {
    public static void main(String[] args) {
        int[] nums = {72,3,54,66,12,32,89,23,44,90,0};
        shellSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void shellSort(int[] nums) {
        int gap = nums.length/2;
        while (gap > 1){
            insertByGap(nums,gap);
            gap /= 2;
        }
        insertByGap(nums,1);
    }

    private static void insertByGap(int[] nums, int gap) {
        for (int i = 0; i < nums.length; i++) {
            int j = i - gap;
            int bound = nums[i];
            for (; j >= 0 && nums[j] > bound; j-=gap){
                nums[j+gap] = nums[j];
            }
            nums[j+gap] = bound;
        }
    }

    /**
     *
     * 希尔排序: 按照距离为gap分组进行排序,直到gap为1时
     * 是对直接插入排序的优化
     * 时间复杂度: O(n2)
     * 空间复杂度: O(1)
     * 不稳定
     */


}
