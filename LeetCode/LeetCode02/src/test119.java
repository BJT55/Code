import java.util.ArrayList;
import java.util.List;

public class test119 {
    public static void main(String[] args) {
        Solution119 s = new Solution119();
        System.out.println(s.getRow(3));
    }
}

class Solution119 {
    public List<Integer> getRow(int rowIndex){
        List< List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++){
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
        return ret.get(rowIndex - 1);
    }
}