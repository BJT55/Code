import java.util.Scanner;

public class Day25_1 {
    public static void main(String[] args) {
        int[] num = new int[10001];
        num[1] = 1;
        num[2] = 2;
        for (int i = 3; i < 10001; ++i){
            num[i] = (num[i-1]+num[i-2])%10000;
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            StringBuilder res = new StringBuilder();
            int n = in.nextInt();
            for (int i = 0; i < n; ++i){
                int xi = in.nextInt();
                res.append(String.format(("%04d"),num[xi]));
            }
            System.out.println(res.toString());
        }
    }
}
