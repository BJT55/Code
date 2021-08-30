public class Solution39 {
    public static void main(String[] args) {
        int[] nums = {21,34,87,11,9,45,78};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums[nums.length/2];
    }

    private static void quickSort(int[] nums, int i, int j) {
        if (i >= j) return;

        int left = i, right = j;
        int bound = nums[i];
        while (left < right){
            while (left < right && nums[right] > bound){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] < bound){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = bound;
        quickSort(nums,i,left-1);
        quickSort(nums,left+1,j);
    }
}
