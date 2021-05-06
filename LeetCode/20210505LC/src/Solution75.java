import java.util.Arrays;

class Solution75 {
    public static void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length-1;
        int i = 0;
        while (i <= p2){
            if(nums[i] == 0 && p0 != i){
                swap(nums,i,p0);
                p0++;
                continue;
            }
            if(nums[i] == 2){
                swap(nums,i,p2);
                p2--;
                continue;
            }
            i++;
        }
    }
    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,2,0,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}