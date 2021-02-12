import java.util.HashMap;

//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
//使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k
public class test219 {

}

/*

//自己：2129ms，运行时间太长
class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length - 1; ++i){
            for(int j = 1; j <= k; ++j){
                if(i + j < nums.length){
                    if(nums[i] == nums[i+j] ) return true;
                }
            }
        }
        return false;
    }
}*/

// 哈希 ：
class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(map.get(nums[i]) != null && (i - map.get(nums[i] )) <= k)
                return true;
            map.put(nums[i],i);
        }
        return false;
    }
}