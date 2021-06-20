import java.util.*;
public class HJ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long n = in.nextLong();
            for(int i = 2; i <= Math.sqrt(n); ++i){
                while(n % i == 0){
                    System.out.print(i + " ");
                    n /= i;
                }
            }
            if(n != 1){
                System.out.print(n + " ");
            }
        }
    }
}