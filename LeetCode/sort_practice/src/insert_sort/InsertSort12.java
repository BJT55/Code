package insert_sort;

public class InsertSort12 {
    public static void main(String[] args) {
        int[] nums = {76,3,54,66,12,32,89,23,44,90,0};
        insertSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void insertSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i-1;
            int bound = nums[i];
            for (; j >= 0 && nums[j] >= bound; j--) {
                nums[j+1] = nums[j];
            }
            nums[j+1] = bound;
        }
    }

    /**
     * 直接插入排序: 每次选择无序区间的第一个,将其插入到有序区间合适的位置,直到...
     * 时间复杂度: O(n2)
     * 空间复杂度: O(1)
     * 稳定
     */



}
