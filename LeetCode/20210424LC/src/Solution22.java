import java.util.ArrayList;
import java.util.List;

class Solution22 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n <= 0){
            return res;
        }
        getParenthesis("",n,n);
        return res;
    }
    public void getParenthesis(String str, int left, int right){
        if (left == 0 && right == 0){
            res.add(str);
            return;
        }
        if (left == right){
            //
            getParenthesis(str+"(",left-1,right);
        }else if (left < right){
            if (left > 0){
                getParenthesis(str+"(",left-1,right);
            }
            getParenthesis(str+")",left,right-1);
        }
    }
}