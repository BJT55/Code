import java.util.Arrays;
import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            int t = Integer.parseInt(s);


            while (t > 0) {
                String s1 = in.nextLine();
                String[] ss1 = s1.split(" ");
                int n = Integer.parseInt(ss1[0]);
                int m = Integer.parseInt(ss1[1]);
                int val = Integer.parseInt(ss1[2]);

                String s2 = in.nextLine();
                String[] ss2 = s2.split(" ");
                long[] arr = new long[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(ss2[i]);
                }

                help(arr,n,m,val);
                t--;
            }
        }
    }

    private static void help(long[] arr, int n, int m, int val) {
        Arrays.sort(arr);
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) start = i;
            else break;
        }

        for (int i = arr.length-1; i > start; i--){
            long tmp = arr[i];
            arr[i] = (long)Math.pow(arr[i],3);
            if (getSum(arr) == val){
                System.out.println("YES");
                return;
            }else if (getSum(arr) > val){
                arr[i] = tmp;
            }else {
                m--;
            }

            if (m < 0){
                System.out.println("NO");
                return;
            }
        }
    }

    private static long getSum(long[] arr) {
        long sum = 0;
        for (long n : arr){
            sum += n;
        }
        return sum;
    }
}
