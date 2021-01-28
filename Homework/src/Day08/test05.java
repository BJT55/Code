package Day08;

import java.util.Arrays;

// 定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。
// 要求算法时间复杂度必须是O(n)
public class test05 {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums){
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }else if (first == nums[i]){
                continue;
            }else if (nums[i] > second){
                third= second;
                second = nums[i];
            }else if (nums[i] == second){
                continue;
            }else if (nums[i] > third){
                third = nums[i];
            }
        }
        return (int) (third == Long.MIN_VALUE ? first : third);
    }
}
