import java.util.Scanner;

public class Day28_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if (n == 0){
                break;
            }
            long sum = (long) (Math.pow(5,n) - 4);
            long old = (long) (Math.pow(4,n) + n - 4);
            System.out.println(sum + " " + old);
        }
    }
}
