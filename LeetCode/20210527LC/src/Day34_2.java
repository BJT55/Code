import java.util.Scanner;

public class Day34_2 {
    public static long[] num = new long[91];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        num[1] = 1;
        num[2] = 2;
        for(int i = 3; i < 91; ++i){
            num[i] = num[i-1] + num[i-2];
        }
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(num[n]);
        }
    }
}