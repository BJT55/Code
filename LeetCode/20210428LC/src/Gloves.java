import java.util.*;
public class Gloves {
    public int findMinimum(int n, int[] left, int[] right) {
        // write code here
        int res = 0;
        int leftMin = Integer.MAX_VALUE,rightMin = Integer.MAX_VALUE;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < n; ++i){
            // 左右手套其中为0,则最坏情况下需要全部拿走
            if ( left[i]*right[i] == 0){
                res += (left[i]+right[i]);
            }
            else {
                leftMin = Math.min(leftMin,left[i]);
                rightMin = Math.min(rightMin,right[i]);
                leftSum += left[i];
                rightSum += right[i];
            }
        }
        return res + Math.min(leftSum-leftMin+1,rightSum-rightMin+1)+1;
    }
}
