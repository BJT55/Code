import java.util.Scanner;

public class Day14_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            int sum = 0;
            int[] days = {31,59,90,120,151,181,212,243,273,304,334,365};
            if (month >= 2){
                sum += days[month-2];
            }
            sum += day;
            if (month>2){
                if (year%400 == 0 || year%4 == 0 && year%100 != 0){
                    sum += 1;
                }
            }
            System.out.println(sum);
        }
    }
}
