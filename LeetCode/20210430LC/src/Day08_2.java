import java.util.Scanner;

public class Day08_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int max = Math.max(m,n);
        for(int i = max; i <= m*n; ++i){
            if(i%m == 0 && i%n == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
