import java.util.ArrayList;
import java.util.List;

class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0){
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(candidates,res,list,target,0);
        return res;
    }

    private void dfs(int[] candidates, List<List<Integer>> res, List<Integer> list, int target, int index) {
        if (index == candidates.length){
            return;
        }

        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        dfs(candidates, res, list, target, index+1);
        if (target-candidates[index] >= 0){
            list.add(candidates[index]);
            dfs(candidates, res, list, target-candidates[index], index);
            list.remove(list.size()-1);
        }
    }
}