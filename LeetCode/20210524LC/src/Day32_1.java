import java.util.Scanner;

public class Day32_1 {
    public static int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static int[] money = {0,62,28,31,60,31,60,31,62,60,62,30,62};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int year1 = in.nextInt();
            int month1 = in.nextInt();
            int day1 = in.nextInt();
            int year2 = in.nextInt();
            int month2 = in.nextInt();
            int day2 = in.nextInt();
            System.out.println(taoBaoWeb(year1,year2,month1,month2,day1,day2));
        }
    }
    public static int taoBaoWeb(int year1,int year2,int month1,int month2,int day1,int day2){
        int res = 0;
        if (year1 == year2){
            // 同年
            if (isLeapYear(year1)){
                // 是闰年
                if (month2 >= 2 && day2 >= 29){
                    res += 1;
                }
            }
            for (int i = month1; i < month2; ++i){
                res += money[i];
            }
            if (isPrimMonth(month1)){
                res -= day1*2;
            }else {
                res -= day1;
            }
            if (isPrimMonth(month2)){
                res += day2*2;
            }else {
                res += day2;
            }
        }else {

        }
        return res;
    }

    // 判断是否为闰年
    public static boolean isLeapYear(int year){
        if ( (year%4 == 0 && year%100 != 0)
                || (year%400 == 0)){
            return true;
        }
        return false;
    }
    // 判断是否为素数月
    public static boolean isPrimMonth(int month){
        if (month == 2 || month == 3 || month == 5 || month == 7 || month == 11){
            return true;
        }
        return false;
    }
}
