import java.util.Scanner;

public class HJ38 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double total = 0;
        double height = n;
        for(int i = 0; i < 5; ++i){
            total += height*2;
            height /= 2;
        }
        total -= n;
        System.out.printf("%.6f\n",total);
        System.out.printf("%.6f\n",height);
    }
}
