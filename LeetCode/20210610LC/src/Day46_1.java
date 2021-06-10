import java.util.Arrays;

public class Day46_1 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int len = array.length;
        int mid = array[len/2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == mid){
                count++;
            }
        }
        return count >= len/2 ? mid : 0;
    }
}