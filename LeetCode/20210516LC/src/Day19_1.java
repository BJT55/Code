import java.util.Scanner;

public class Day19_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(bottles(n));
        }
    }
    public static int bottles(int n){
        if ( n <= 0){
            return 0;
        }else if (n == 2 || n == 3){
            return 1;
        }else {
            int res = 0;
            res = n/3;
            return  res + bottles(n - 3*res + res);
        }
    }
}
