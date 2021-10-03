
public class Solution473 {
    public boolean makesquare(int[] matchsticks) {
        if (matchsticks.length == 0) return false;
        int sum = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            sum += matchsticks[i];
        }

        if (sum/4*4 != sum) return false;
        return dfs(matchsticks,0,matchsticks.length,0,0,0,0,sum/4);
    }

    private boolean dfs(int[] nums, int i, int length, int i1, int i2, int i3, int i4, int i5) {
        if (i == length){
            if (i1 == i5 && i2 == i5 && i3 == i5 && i4 == i5){
                return true;
            }else {
                return false;
            }
        }

        if (i1>i5 || i2>i5 || i3>i5 || i4>i5){
            return false;
        }

        return dfs(nums, i+1, length, i1+nums[i], i2, i3, i4, i5)||
                dfs(nums, i+1, length, i1, i2+nums[i], i3, i4, i5)||
                dfs(nums, i+1, length, i1, i2, i3+nums[i], i4, i5)||
                dfs(nums, i+1, length, i1, i2, i3, i4+nums[i], i5);
    }
}
