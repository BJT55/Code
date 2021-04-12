import java.util.Arrays;
import java.util.Scanner;

public class test0412_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n*3];
            for(int i = 0; i < arr.length; ++i){
                arr[i] = scanner.nextInt();
            }
            System.out.println(avgSum(n,arr));
        }
    }
    public static long avgSum(int n, int[] arr){
        Arrays.sort(arr);
        long sum = 0;
        for (int i = arr.length-1-1; i >= 1; i-=2){
            sum += arr[i];
            n--;
            if(n <= 0){
                break;
            }
        }
        return sum;
    }
}