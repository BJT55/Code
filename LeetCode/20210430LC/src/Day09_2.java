import java.util.Scanner;

public class Day09_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(solution(n,m));
        }
    }
    public static int solution(int n, int m){
        if ( n == 0 || m == 0){
            return 1;
        }
        return solution(n-1,m)+solution(n,m-1);
    }
}
