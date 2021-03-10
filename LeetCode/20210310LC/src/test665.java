public class test665 {
}
/*
class Solution665 {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; ++i){
            int x = nums[i], y = nums[i+1];
            if (x > y){
                nums[i] = y;
                if (isSorted(nums)){
                    return true;
                }
                nums[i] = x;
                nums[i+1] = x;
                return isSorted(nums);
            }
        }
        return true;
    }
    public boolean isSorted(int[] nums){
        int n = nums.length;
        for (int i = 1; i < n-1; ++i){
            if (nums[i-1] > nums[i])
                return false;
        }
        return true;
    }
}
*/



class Solution665 {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length, count = 0;
        for (int i = 0; i < n-1; ++i){
            int x = nums[i], y = nums[i+1];
            if (x > y){
                count++;
                if (count > 1){
                    return false;
                }
                if (i > 0 && y < nums[i - 1]){
                    nums[i+1] = x;
                }
            }
        }
        return true;
    }
}
