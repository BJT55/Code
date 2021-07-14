import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(false,0,nums);
        return res;
    }

    private void dfs(boolean choosePre, int cur, int[] nums) {
        if (cur == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        dfs(false,cur+1,nums);
        if (!choosePre && cur > 0 && nums[cur-1] != nums[cur]){
            return;
        }
        list.add(nums[cur]);
        dfs(true,cur+1,nums);
        list.remove(list.size()-1);
    }

}
