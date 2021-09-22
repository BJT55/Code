package insert_sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {76,3,54,66,12,32,89,23,44,90,0};
        insertSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void insertSort(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int tmp = nums[i];
            int j = i-1;
            for (; j >= 0 && nums[j] > tmp; j--){
                nums[j+1] = nums[j];
            }
            nums[j+1] = tmp;
        }
    }

}
