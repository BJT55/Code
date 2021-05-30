import java.util.Scanner;

public class Day34_2 {
    public static long[] num = new long[91];
    public static void main(String[] args){
        num[0] = 1;
        num[1] = 1;
        for(int i = 2; i < 91; ++i){
            num[i] = num[i-1] + num[i-2];
        }
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = Integer.parseInt(in.nextLine());
            System.out.println(num[n]);
        }
    }
}
