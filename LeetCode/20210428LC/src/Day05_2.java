import java.util.Scanner;

public class Day05_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; ++i){
            arr[i] = in.nextInt();
        }

        int sum = arr[0];
        int max = arr[0];
        for (int i = 1; i < len; ++i){
            sum = getMax(sum+arr[i],arr[i]);
            if (sum >= max){
                max = sum;
            }
        }
        System.out.println(sum);
    }

    public static int getMax(int a, int b){
        return a > b ? a : b;
    }
}
