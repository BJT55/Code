import java.util.Arrays;

//给定一个整数数组，判断是否存在重复元素。
//如果存在一值在数组中出现至少两次，函数返回 true 。
//如果数组中每个元素都不相同，则返回 false 。
public class test217 {
}

// 直接暴力循环两层，O(n^2)则会出现超时
// 因此先对数组进行排序，再进行判断 n + n --> O(n)
class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; ++i){
            if(nums[i + 1] == nums[i]) return true;
        }
        return false;
    }
}