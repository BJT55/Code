import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n <= 0) return res;

        getParenthesis("",n,n);
        return res;
    }

    private void getParenthesis(String s, int left, int right) {
        if (left == 0 && right == 0){
            res.add(s);
            return;
        }

        if (left == right){
            //剩余左右括号数相等，下一个只能用左括号
            getParenthesis(s+"(",left-1,right);
        }else if (left < right){
            if (left > 0) {
                //剩余左括号小于右括号，下一个可以用左括号也可以用右括号
                getParenthesis(s+"(", left-1, right);
            }
            getParenthesis(s+")", left, right-1);
        }
    }

}
