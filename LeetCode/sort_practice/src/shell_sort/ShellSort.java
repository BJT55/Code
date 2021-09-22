package shell_sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] nums = {3,54,6,12,32,89,23,44,90,0};
        shellSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void shellSort(int[] nums) {
        int gap = nums.length;
        while (gap > 1){
            insertOfGap(nums,gap);
            gap /= 2;
        }
        insertOfGap(nums,1);
    }

    private static void insertOfGap(int[] nums, int gap) {
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i-gap;
            for (; j >= 0 && nums[j] > tmp; j-=gap){
                nums[j+gap] = nums[j];
            }
            nums[j+gap] = tmp;
        }
    }

}
