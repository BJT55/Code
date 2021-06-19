import java.util.Scanner;

public class Day47_1 {
    public static void main(String[] args) {
        int n;
        int k;
        int d;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        k = in.nextInt();
        d = in.nextInt();
        System.out.println(getMax(arr,n,k,d));
    }

    private static long getMax(int[] arr, int n, int k, int d) {
        long[][] maxValue = new long[n+1][k+1];
        long[][] minValue = new long[n+1][k+1];
        long res = 0;
        // a[i,j] : 以第 i 学生为结尾, 共选了 j 个学生的最大值
        // 初始化
        for (int i = 1; i <= n; i++) {
            maxValue[i][1] = minValue[i][1] = arr[i-1];
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= k ; j++) {
                // 相邻的同学间隔不超过 d
                for (int l = i-1; l >= Math.max(i-d,1) ; l--) {
                    maxValue[i][j] = Math.max(maxValue[i][j],
                                              Math.max(maxValue[l][j-1]*arr[i-1],minValue[l][j-1]*arr[i-1]));
                }
            }
            // 更新最大值
            res = Math.max(res,maxValue[i][k]);
        }
        return res;
    }
}
