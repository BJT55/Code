import java.util.ArrayList;
import java.util.List;

public class Solution77 {

    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k){
            return res;
        }

        List<Integer> list = new ArrayList<>();
        dfs(n,k,1,list,res);
        return res;
    }
    private void dfs(int n, int k, int index, List<Integer> list, List<List<Integer>> res){
        if (list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i <= n; i++){
            list.add(i);
            dfs(n,k,i+1,list,res);
            list.remove(list.size()-1);
        }
    }
}
