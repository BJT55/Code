import java.util.Arrays;

public class test594 {
}

/*
class Solution594 {
    public int findLHS(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; ++i){
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < nums.length; ++j){
                if (nums[i] == nums[j])
                    count++;
                else if (nums[j] + 1 == nums[i]){
                    count++;
                    flag = true;
                }
            }
            if (flag)
                res = Math.max(count,res);
        }
        return res;
    }
}*/


class Solution594 {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0, j = 0; i < nums.length; ++i){
            while (nums[i] - nums[j] > 1)
                j++;
            if (nums[i] - nums[j] == 1)
                max = Math.max(max,i - j + 1);
        }
        return max;
    }
}