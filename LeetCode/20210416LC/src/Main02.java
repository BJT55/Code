import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < arr.length; ++i){
                arr[i] = in.nextInt();
            }
            System.out.println(Solution(n,arr));
        }
    }
    public static long Solution(int n, int[] arr){
        long sum = arr[0];
        long res = 0;
        for (int i = 0,j = 1; j < arr.length;){
            if (up(arr,i,j)){
                sum += arr[j];
            }else if (down(arr,i,j)){
                sum += arr[j];
            }else {
                i = j;
                sum = arr[j];
            }
            j++;
            res = Math.max(sum,res);
        }
        res = Math.max(sum,res);
        return res;
    }
    public static boolean up(int[] arr, int l, int r){
        // 判断升序
        for (int i = l; i+1 <= r; ++i){
            if (arr[i+1] - arr[i] != 1){
                return false;
            }
        }
        return true;
    }

    public static boolean down(int[] arr, int l, int r){
        // 判断降序
        for (int i = l; i+1 <= r; ++i){
            if (arr[i+1] - arr[i] != -1){
                return false;
            }
        }
        return true;
    }
}