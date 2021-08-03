import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public String convert(String s, int numRows){
        if (numRows == 1){
            return s;
        }

        List<StringBuilder> row = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows,s.length()); i++){
            row.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()){
            row.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows-1){
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder tmp : row){
            res.append(tmp);
        }
        return res.toString();
    }
}
