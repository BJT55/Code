import java.util.Scanner;

public class Day28_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int monkey = in.nextInt();
            if (monkey == 0){
                break;
            }
            long a = (long) Math.pow(5,monkey);
            long b = (long) Math.pow(4,monkey);
            System.out.println((a - 4) + " " + (b + monkey -4));
        }
    }
}
