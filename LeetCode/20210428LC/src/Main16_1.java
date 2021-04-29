import java.util.Scanner;

public class Main16_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while (in.hasNext()) {
            n = in.nextInt();
            if (n <= 0){
                System.out.println(-1);
            }
            int count = 0;
            for (int i = 1; i <= n; ++i){
                if(perfectNum(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean perfectNum(int n){
        if(n == 1)
            return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); ++i){
            if (n % i == 0 && i * i != n){
                sum += (i + n/i);
            }else if(i*i == n){
                sum += i;
            }
        }
        if (sum == n){
            return true;
        }
        return false;
    }
}
