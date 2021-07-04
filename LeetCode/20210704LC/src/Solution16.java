import java.util.Arrays;

public class Solution16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;

        // 枚举 a
        for (int i = 0; i < n; ++i){
            // 保证和上一次枚举的元素不相等
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            // 使用双指针
            int j = i+1, k = n-1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target){
                    return target;
                }

                // 根据差值的绝对值来更新答案
                if (Math.abs(sum-target) < Math.abs(best-target)){
                    best = sum;
                }
                if (sum > target){
                    // 如果和大于target, 移动k向左
                    int k0 = k-1;
                    // 移动到下一个不相等的元素
                    while (j < k0 && nums[k0] == nums[k]){
                        --k0;
                    }
                    k = k0;
                }else {
                    // 如果和大于target, 移动j向左
                    int j0 = j+1;
                    while (j0 < k && nums[j] == nums[j0]){
                        j0++;
                    }
                    j = j0;
                }
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,-1,-1,3};
        int target = -1;
        System.out.println(threeSumClosest(nums,target));
    }
}
