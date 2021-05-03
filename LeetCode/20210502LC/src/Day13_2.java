import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day13_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] step = new int[m + 1];
        for (int i = 0; i < m+1; ++i) {
            step[i] = Integer.MAX_VALUE;
        }
        step[n] = 0;
        for (int i = n; i < m; ++i) {
            if (step[i] == Integer.MAX_VALUE) {
                continue;
            }
            // 创建 n 的约数的链表
            List<Integer> list = approximateNum(i);
            for (int j : list) {
                if (i + j <= m && step[i + j] != Integer.MAX_VALUE) {
                    step[i + j] = Math.min(step[i + j], step[i] + 1);
                } else if (i + j <= m) {
                    step[i + j] = step[i] + 1;
                }
            }
        }
        // 判断是否能到达 m
        if (step[m] == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(step[m]);
    }

    // 存放 n 的约数
    public static List<Integer> approximateNum(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i*i <= n; ++i){
            if (n%i == 0){
                list.add(i);
                if (i*i != n){
                    list.add(n/i);
                }
            }
        }
        return list;
    }
}


