import java.util.Arrays;

public class Solution01 {
    public int maxDistance (int[] arr) {
        // write code here
        Arrays.sort(arr);
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res,arr[i]-arr[i-1]);
        }
        return res;
    }
}
