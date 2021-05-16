import java.util.Scanner;

public class Day25_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long n = in.nextLong();
            System.out.println(theRootOfNumber(n));
        }
    }
    public static int theRootOfNumber(long n){
        if (n / 10 == 0){
            return (int)n;
        }
        return theRootOfNumber(addEveryNumber(n));
    }
    public static int addEveryNumber(long n){
        int tmp = 0;
        while (n > 0){
            tmp += n%10;
            n /= 10;
        }
        return  tmp;
    }
}
