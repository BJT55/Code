import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            long n = in.nextLong();
            Solution(n);
        }
    }
    public static void Solution(long n){
        if(n <= 2 || n%2 != 0){
            return ;
        }
        long res1 = n/2;
        long res2 = n/2;
        while (res1 != 1 && res2 != n){
            if (rightNumber(res1) && rightNumber(res2)){
                System.out.println(res1);
                System.out.println(res2);
                break;
            }else {
                res1--;
                res2 = n - res1;
            }

        }
        return ;
    }
    public static boolean rightNumber(long num){
        if (num == 2){
            return true;
        }
        for (int i = 2; i < num; ++i){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}