import java.util.ArrayList;

public class JZ29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int len = input.length;
        if (k == 0 || k > len){
            return res;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (input[j] > input[i]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
}
