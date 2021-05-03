import java.util.Scanner;

public class Day11_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int max = 0,tmp = 0;
            while (n > 0){
                if ((n&1) == 1){
                    tmp++;
                    max = Math.max(max,tmp);
                }else
                    tmp = 0;

                n >>= 1;
            }
            System.out.println(max);
        }
    }
}
