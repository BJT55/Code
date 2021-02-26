public class test485 {

}

class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tmp = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == 1) tmp++;
            else tmp = 0;
            count = count > tmp ? count : tmp;
        }
        return count;
    }
}

