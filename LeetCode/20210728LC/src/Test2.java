public class Test2 {
    public void selectSort(int[] nums){
        int bound = 0;
        for (; bound < nums.length; bound++){
            for (int cur = bound+1; cur < nums.length; cur++){
                if (nums[bound] > nums[cur]){
                    int tmp = nums[bound];
                    nums[bound] = nums[cur];
                    nums[cur] = tmp;
                }
            }
        }
    }
}
