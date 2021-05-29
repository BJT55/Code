import java.util.Scanner;

public class taoBao {
    // 判断是否是闰年
    public static boolean isLeapYear(int year){
        return year%400 == 0 || ( year%4 == 0 && year%100 != 0);
    }
    // 计算一整年的利润
    public static int profitOfYear(int year){
        return  579 + (isLeapYear(year) ? 1 : 0);
    }
    // 判断是否为素数月
    public static boolean isPrimeMonth(int month){
        return month == 2 || month == 3 || month == 5 || month == 7 || month == 11;
    }
    // 计算当前年份的利润
    public static int profitOfThisYear(int year, int month, int day){
        int profit = 0;
        if (!isPrimeMonth(month)){
            profit = day * 2;
        }else {
            profit = day;
        }

        while (--month > 0){
            switch (month){
                case 1: case 8: case 10: case 12:
                    profit += 62;
                    break;
                case 3: case 5: case 7:
                    profit += 31;
                    break;
                case 4: case 6: case 9:
                    profit += 60;
                    break;
                case 11:
                    profit += 30;
                    break;
                default:  // case = 2
                    profit += (28 + (isLeapYear(year) ? 1 : 0));
                    break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int year1 = in.nextInt();
            int month1 = in.nextInt();
            int day1 = in.nextInt();
            int year2 = in.nextInt();
            int month2 = in.nextInt();
            int day2 = in.nextInt();

            int profit = 0;

            profit = profitOfYear(year1) - profitOfThisYear(year1,month1,day1-1);
            profit += profitOfThisYear(year2,month2,day2);
            if (year1 == year2){
                profit -= profitOfYear(year1);
            }
            for (int i = year1 + 1; i < year2; ++i){
                profit += profitOfYear(i);
            }
            System.out.println(profit);
        }
    }
}
