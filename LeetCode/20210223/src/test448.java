import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class test448 {
}

// 自己： 73.53%
class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] <= n){
                nums[nums[i] - 1] += n;
            }else nums[(nums[i] - 1)%n] += n;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            if (nums[i] <= n) list.add(i+1);
        }
        return list;
    }
}

/*
// 官方一：
class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            nums[Math.abs(nums[i]) - 1 ] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i){
            if(nums[i] > 0) list.add(i+1);
        }
        return list;
    }
}
*/
/*
// 官方二：
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num:nums){
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            if (nums[i] <= n) list.add(i+1);
        }
        return list;
    }
}*/
