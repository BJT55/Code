import java.util.*;

class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0){
            return res;
        }

        Arrays.sort(candidates);

        Deque<Integer> deque = new ArrayDeque<>(len);
        dfs(candidates,len,0,target,deque,res);
        return res;
    }

    private void dfs(int[] candidates, int len, int begin, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; ++i){
            // 大剪枝: 当candidates[i] < 0时, 后面的i+1,i+2肯定也小于0, 减去
            if (target - candidates[i] < 0){
                break;
            }

            // 小剪枝: 同一层相同数值的结点
            // 从第2个开始, 候选数更少, 结果一定发生重复, 跳过
            if (i > begin && candidates[i] == candidates[i-1]){
                continue;
            }

            path.addLast(candidates[i]);
            dfs(candidates, len, i+1, target-candidates[i], path, res);
            path.removeLast();
        }

    }
}