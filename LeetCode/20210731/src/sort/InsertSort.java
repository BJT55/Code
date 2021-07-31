package sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,7,9,5,8,4,6};
        insert_2(nums);
        for (int n : nums){
            System.out.print(n+" ");
        }
    }

    private static void insert(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int tmp = nums[i];
            int j = i-1;
            for (; j >= 0 && nums[j] > tmp; j--){
                nums[j+1] = nums[j];
            }
            nums[j+1] = tmp;
        }
    }

    private static void insert_2(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int tmp = nums[i];
            int j = i-1;
            for (; j >= 0 && nums[j] > tmp; j--){
                nums[j+1] = nums[j];
            }
            nums[j+1] = tmp;
        }
    }

    private static void insert_3(int[] nums) {

    }


}
