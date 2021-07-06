import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution47 {
    boolean[] vis;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(nums,res,0,list);
        return res;
    }

    private void backTrack(int[] nums, List<List<Integer>> res, int index, List<Integer> list) {
        if (index == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; ++i){
            if (vis[i] || ( i > 0 && nums[i] == nums[i-1] && !vis[i-1]) ){
                continue;
            }

            list.add(nums[i]);
            vis[i] = true;
            backTrack(nums, res, index+1, list);
            vis[i] = false;
            list.remove(index);
        }
    }
}
