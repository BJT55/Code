import java.util.ArrayList;
import java.util.List;

public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size()-1; j >= 0; --j) {
                res.add(head + res.get(j));
            }
            head <<= 1;
        }
        return res;
    }

    public List<Integer> grayCode_2(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            res.add(i ^ i>>1);
        }
        return res;
    }
}
