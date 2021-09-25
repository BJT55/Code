import java.util.*;

public class Solution04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            String[] ss1 = s1.split(" ");
            int n = Integer.parseInt(ss1[0]);
            int m = Integer.parseInt(ss1[1]);
            String s2 = in.nextLine();
            String[] ss2 = s2.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ss2[i]);
            }

            System.out.println(group(arr,m));
        }
    }

    private static int group(int[] arr, int m) {
        int res = 0;
        int bound = 0;
        for (int n : arr){
            bound += n;
        }
        bound /= m;


        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++){
            if (tmp >= bound){
                res += (max-min);
                tmp = arr[i];
                min = arr[i];
                max = arr[i];
            }else {
                tmp += arr[i];
                min = Math.min(min,arr[i]);
                max = Math.max(max,arr[i]);
            }
        }
        if (tmp != 0){
            res += (max-min);
        }
        return res;
    }
}
