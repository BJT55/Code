package sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,7,9,5,8,4,6};
        shell(nums);
        for (int n : nums){
            System.out.print(n+" ");
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void shell(int[] nums) {
        int gap = nums.length;
        while (gap > 1){
            insertSortGap(nums,gap);
            gap /= 2;
        }
        insertSortGap(nums,1);
    }

    private static void insertSortGap(int[] nums, int gap) {
        for (int i = 0; i < nums.length; i++){
            int tmp = nums[i];
            int j = i - gap;
            for (; j >= 0 && nums[j] > tmp; j-=gap){
                nums[j+gap] = nums[j];
            }
            nums[j+gap] = tmp;
        }
    }

}
