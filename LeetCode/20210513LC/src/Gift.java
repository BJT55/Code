import java.util.*;

public class Gift {
    public static int getValue(int[] gifts, int n) {
        // write code here
        int res = 0;
        Arrays.sort(gifts);
        int mid = n/2;
        for (int i = 0; i < n; ++i ){
            if (gifts[i] == gifts[mid]){
                res++;
            }
            if (res > n/2){
                return gifts[mid];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] gifts = {1,2,3,2,2,};
        System.out.println(getValue(gifts,5));
    }
}