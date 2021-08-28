import java.util.ArrayList;
import java.util.List;

public class Solution78_2 {
    List<Integer> tmp = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums);
        return res;
    }

    private void dfs(int cur, int[] nums) {
        if (cur == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }

        tmp.add(nums[cur]);
        dfs(cur+1, nums);
        tmp.remove(tmp.size()-1);
        dfs(cur+1, nums);
    }
}
