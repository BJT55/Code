import java.util.ArrayList;
import java.util.List;

class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(res,list,nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> list,int[] nums){
        if (list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int n : nums){
            if (!list.contains(n)){
                list.add(n);
                backtrack(res,list,nums);
                list.remove(list.size()-1);
            }
        }
    }
}