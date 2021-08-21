import java.util.ArrayList;
import java.util.List;

public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0) return res;
        boolean[] visited = new boolean[nums.length];
        dfs(nums,visited,list,res);
        return res;
    }

    private void dfs(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (!visited[i]){ // 未被访问过
                list.add(nums[i]);
                visited[i] = true;
                dfs(nums, visited, list, res);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}
