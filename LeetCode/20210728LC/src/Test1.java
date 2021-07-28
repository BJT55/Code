public class Test1 {
    public static void insertSort(int[] nums){
        for(int i = 1; i < nums.length; ++i){
            int v = nums[i];
            int j = i-1;
            for (; j >= 0 && nums[j] > v; --j){
                nums[j+1] = nums[j];
            }
            nums[j+1] = v;
        }
    }
}
