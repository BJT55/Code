import java.util.ArrayList;
import java.util.List;

public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs(candidates,target,res,combine,0);
        return res;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> combine, int index) {
        if (index == candidates.length) return;
        if (target == 0) {
            res.add(new ArrayList<>(combine));
            return;
        }

        dfs(candidates, target, res, combine, index+1);
        if (target - candidates[index] >= 0){
            combine.add(candidates[index]);
            dfs(candidates, target-candidates[index], res, combine, index);
            combine.remove(combine.size()-1);
        }
    }


}
