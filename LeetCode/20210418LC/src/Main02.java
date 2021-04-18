import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Solution(a,b));
        }
    }
    public static long Solution(int a, int b){
        long res = a > b ? b : a;
        for (long i = res; i <= a*b; ++i){
            if (i % a == 0 && i % b == 0){
                res = i;
                break;
            }
        }
        return res;
    }
}
