import java.util.Scanner;

public class Day19_1 {
    public static int res;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            res = 0;
            if (n == 0){
                break;
            }
            if (n == 1){
                System.out.println(0);
            }
            while (n >= 2){
                if (n == 2){
                    res += 1;
                    break;
                }
                else {
                    res += n/3;
                    n = n/3 + n%3;
                }
            }
            System.out.println(res);
        }
    }
}
