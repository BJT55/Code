import java.util.Arrays;

class Solution41 {
    public static int firstMissingPositive(int[] nums) {
        // 将所有不在 [1,n] 的数改为 n+1
        int n = nums.length;
        for (int i = 0; i < n; ++i){
            if (nums[i] <= 0){
                nums[i] = n+1;
            }
        }
        // 将在 [1,n] 的数设为负值,作为标记
        for (int i = 0; i < n ; ++i){
            int num = Math.abs(nums[i]);
            if (num <= n){
                nums[num-1] = -Math.abs(nums[num-1]);
            }
        }
        // 找到第一个不为负值的数值 下标+1 为缺失得数
        for (int i = 0; i < n; ++i){
            if (nums[i] > 0){
                return i+1;
            }
        }
        // [1,n]数都已经变为负数,则缺失的数为 n+1
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
}