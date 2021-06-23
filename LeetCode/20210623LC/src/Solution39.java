import java.util.ArrayList;
import java.util.List;

class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(candidates,target,res,list,0);
        return res;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> list, int index) {
        if (index == candidates.length){
            return;
        }

        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        dfs(candidates,target,res,list,index+1);
        if (target-candidates[index] >= 0){
            list.add(candidates[index]);
            dfs(candidates,target-candidates[index],res,list,index);
            list.remove(list.size()-1);
        }
    }
}