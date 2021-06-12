import java.util.Arrays;

public class Day48_1 {
    public static int findMaxGap(int[] A, int n) {
        // write code here
        int max = Integer.MIN_VALUE;
        int index = 0;  // 记录最大值下标
        for (int i = 0; i < n; i++) {
            if (max < A[i]){
                max = A[i];
                index = i;
            }
        }
        int minStart = 0;
        int min = Integer.MAX_VALUE;
        if (index <= n-2){
            // max值在左边
            minStart = index + 1;
            for (int i = minStart; i < n; i++) {
                min = Math.min(min,A[i]);
            }
        }else {
            // max值在右边
            for (int i = 0; i <= n-2 ; i++) {
                min = Math.min(min,A[i]);
            }
        }
        return max-min;
    }

    public static void main(String[] args) {
        int[] A = {2,3,3,1,7};
        System.out.println(findMaxGap(A,5));
    }
}
