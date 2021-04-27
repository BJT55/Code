public class Day03_2 {
    public int moreOfNumber(int[] nums){
        if (nums == null || nums.length == 0)
            return 0;

        int result = nums[0];
        int count = 1; //次数
        for (int i = 1; i < nums.length; ++i){
            if (count != 0){
                if (nums[i] == result){
                    count++;
                }else {
                    count--;
                }
            }else {
                result = nums[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == result){
                count++;
            }
        }
        return (count > nums.length/2) ? result : 0;
    }
}
