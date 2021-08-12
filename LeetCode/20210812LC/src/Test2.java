public class Test2 {
    public int index;
    private int num;
    public static void main(String[] args) {
        int[] nums;
    }
    private void help(int[] nums){
        int i = 0;
        while (i < nums.length-1){
            if (nums[i]*nums[i+1]<0){
                index = nums[i] < 0 ? i : i+1;
                num = nums[i] < 0 ? nums[i] : nums[i+1];
                break;
            }
            i += 2;
        }
    }
}
