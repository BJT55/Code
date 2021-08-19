import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39_2 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combine = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(combine,candidates,target,0,0);
        return res;
    }

    private void dfs(List<Integer> combine, int[] candidates, int target, int index, int sum) {
        if (sum == target){
            res.add(new ArrayList<>(combine));
            return;
        }

        for (int i = index; i < candidates.length; i++){
            int tmp = candidates[i]+sum;
            if (tmp <= target){
                combine.add(candidates[i]);
                dfs(combine, candidates, target, index, sum);
                combine.remove(combine.size()-1);
            }else {
                break;
            }
        }
    }

}
