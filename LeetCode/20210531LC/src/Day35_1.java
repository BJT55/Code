import java.util.Scanner;

public class Day35_1 {
    public static void main(String[] args) {
        long[] d = new long[21]; //错排数据
        d[0] = d[1] = 0;
        d[2] = 1;
        long[] f = new long[21]; //阶乘
        f[0] = f[1] = 1;
        f[2] = 2;
        for (int i = 3; i < 21; ++i){
            d[i] = (i-1) * (d[i-1] + d[i-2]);
            f[i] = i * f[i-1];
        }

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.printf("%.2f%%\n",100.0*d[n]/f[n]);
        }
    }
}
