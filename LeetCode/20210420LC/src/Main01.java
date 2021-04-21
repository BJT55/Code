import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(Solution(n));
        }
    }
    public static int Solution(int n){
        int sum = 1;
        int count = 0;
        for (int i = 1; i <= n; ++i){
            sum*=i;
            if (sum%10 == 0){
                while (sum/10 > i/10 && sum%10 == 0){
                    count++;
                    sum /= 10;
                }
            }else{
                sum %= 10;
            }
        }

        return count;
    }
}
