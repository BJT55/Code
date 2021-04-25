import java.util.ArrayList;
import java.util.List;

public class Solution22_2 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res,"",0,0,n);
        return res;
    }
    public void generate(List<String> res, String str, int left, int right, int n){
        // left统计 "("个数
        // right统计 ")"个数
        if (left > n || right > n)
            return;
        if (left == n && right == n)
            res.add(str);

        if (left >= right){
            String tmp = new String(str);
            generate(res,tmp+"(",left+1,right,n);
            generate(res,tmp+")",left,right+1,n);
        }
    }
}
