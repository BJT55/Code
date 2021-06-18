import java.util.Arrays;

public class Day46_1 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int len = array.length;
        int num = array[len/2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == num){
                count++;
                if (count >= len/2){
                    return num;
                }
            }
        }
        return 0;
    }
}
