import java.util.*;

class Solution78 {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        res.add(new ArrayList<>());
        dfs(nums,0,new ArrayList<>());
        return res;
    }
    public void dfs(int[] nums, int index, List<Integer> list){
        for(int i = index; i < nums.length; ++i){
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            dfs(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
}