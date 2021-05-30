import java.util.Scanner;

public class Day33_2 {
    public static long[] num = new long[81];
    public static void main(String[] args) {
        num[1] = 1;
        num[2] = 1;
        for (int i = 3; i < 81; ++i){
            num[i] = num[i-1] + num[i-2];
        }

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int from = in.nextInt();
            int to = in.nextInt();

            long breakfast = 0;
            for (int i = from; i <= to; ++i){
                breakfast += num[i];
            }
            System.out.println(breakfast);
        }
    }
}
