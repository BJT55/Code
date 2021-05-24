import java.util.Scanner;

public class Day32_2 {
    public static int[] num = new int[100001];
    public static void main(String[] args) {
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i < 100001; ++i){
            num[i] = (num[i-1] + num[i-2])%1000000;
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.printf((n<25?"%d\n":"%06d\n"), num[n]);
        }
    }
}