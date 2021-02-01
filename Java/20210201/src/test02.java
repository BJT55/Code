// LeetCode118
// 杨辉三角
import java.util.ArrayList;
import java.util.List;

public class test02 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0){
            return new ArrayList<>();
        }

        List< List<Integer>> result = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        result.add(l1);
        if (numRows == 1){
            return result;
        }
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);
        result.add(l2);
        if (numRows == 2){
            return result;
        }
        for (int row = 3; row <= numRows; row++){
            // Lits 下标从 0 开始，还需再 -1
            List<Integer> prevLine = result.get(row - 1 - 1);
            List<Integer> currentLine = new ArrayList<>();
            currentLine.add(1);
            for (int col = 2; col <= row - 1; col++){
                int num1 = prevLine.get(col - 1);
                int num2 = prevLine.get(col - 1 -1);
                currentLine.add(num1 + num2);
            }
            currentLine.add(1);
            result.add(currentLine);
        }
        return result;
    }
}
