import java.util.Scanner;

public class Day12_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            for (int i = n/2; i < n; ++i){
                if (isPrimeNum(i) && isPrimeNum(n-i)){
                    System.out.println(n-i);
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static boolean isPrimeNum(int n){
        if (n == 1)
            return false;
        for (int i = 2; i < n; ++i){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
