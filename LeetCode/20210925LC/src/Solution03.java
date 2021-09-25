import java.util.Arrays;
import java.util.Scanner;

public class Solution03 {
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

            System.out.println(bucket(arr,m));
        }
    }

    private static int bucket(int[] arr, int m) {
        Arrays.sort(arr);
        for (int i = 1; i <= m; i++){
            arr[0] += 1;
            Arrays.sort(arr);
        }
        return arr[0];
    }
}
