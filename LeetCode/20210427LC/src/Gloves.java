import java.util.*;

public class Gloves {
    public static int findMinimum(int n, int[] left, int[] right) {
        // write code here
        int num = n;
        int minGloves = 0;
        Arrays.sort(left);
        Arrays.sort(right);
        for (int i = 0; i < left.length; ++i){
            if (left[i] == 0){
                n--;
            }
        }
        if(n > 1){
            minGloves = n-1; // 左边手套个数
        }else
            minGloves = n;
        minGloves += right[right.length-1]; //先拿到右边最大的
        int i = 0,count = 0;
        while (count < num - n){
            if (i == right.length)
                break;
            minGloves += right[i];
            count++;
            i++;
        }
        return minGloves+1;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] left = {0,7,1,6};
        int[] right = {1,5,0,6};
        System.out.println(findMinimum(n,left,right));
    }
}