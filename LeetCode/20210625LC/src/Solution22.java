import javax.smartcardio.ATR;
import java.util.ArrayList;
import java.util.List;

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res,"",0,0,n);
        return res;
    }

    private void generate(List<String> res, String s, int left, int right, int n) {
        if (left > n || right > n){
            return;
        }
        if (left == n && right == n){
            res.add(s);
            return;
        }

        if (left >= right){
            String tmp = new String(s);
            generate(res, tmp+"(", left+1, right, n);
            generate(res, tmp+")", left, right+1, n);
        }
    }
}
