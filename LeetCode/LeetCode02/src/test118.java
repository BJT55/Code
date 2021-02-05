import java.util.ArrayList;
import java.util.List;

//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
public class test118 {
    public static void main(String[] args) {
        Solution118 s = new Solution118();
        System.out.println(s.generate(6));
    }
}

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List< List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    row.add(1);
                }else {
                    row.add(ret.get(i - 1).get(j) + ret.get(i - 1).get(j - 1));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}