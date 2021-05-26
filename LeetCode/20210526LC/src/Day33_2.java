import java.util.Scanner;

public class Day33_2 {
    public static long[] num = new long[81];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        num[1] = 1;
        num[2] = 1;
        for (int i = 3; i < num.length; ++i){
            num[i] = num[i-1] + num[i-2];
        }
        while (in.hasNext()){
            int from = in.nextInt();
            int to = in.nextInt();
            long res = 0;
            for (int i = from; i <= to; ++i){
                res += num[i];
            }
            System.out.println(res);
        }
    }
}
