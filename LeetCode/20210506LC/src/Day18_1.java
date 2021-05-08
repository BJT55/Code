import java.util.Scanner;

public class Day18_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(getTotalCount(n));
        }
    }
    public static int getTotalCount(int monthCount){
        if (monthCount < 3){
            return 1;
        }
        return getTotalCount(monthCount-2)+getTotalCount(monthCount-1);
    }
}
