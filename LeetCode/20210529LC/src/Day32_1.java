import java.util.Scanner;

public class Day32_1 {
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
            System.out.println(taoBao(year1,month1,day1,year2,month2,day2));
        }
    }
    // 判断是否为闰年
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // 判断是否为素数月
    public static boolean isPrimMonth(int month){
        return month == 2 || month == 3 || month == 5 || month == 7 || month == 11;
    }
    // 获得每月钱数
    public static int getMonthMoney(int year, int month){
        if (isLeapYear(year) && month == 2){
            return money[month]+1;
        }
        return money[month];
    }

    public static int taoBao(int year1,int month1,int day1,int year2,int month2,int day2){
        int res = 0;
        // 满年的利润
        if (year2 - year1 > 1){
            for (int i = year1+1; i < year2; ++i){
                if (isLeapYear(i)){
                    res += 580;
                }else {
                    res += 579;
                }
            }
        }

        if(year1 != year2) { // 不同年
            // 计算不足一年 (第一年 和 最后一年) 的利润
            for (int i = month1; i <= 12; ++i) {
                res += getMonthMoney(year1, i);
            }
            for (int i = 1; i <= month2; ++i) {
                res += getMonthMoney(year2, i);
            }

        } else { // 同年
            if (month1 == month2){  // 同月
                if (isPrimMonth(month1)){
                    return day2-day1+1;
                }else {
                    return (day2-day1+1)*2;
                }
            }
            // 不同月
            for (int i = month1; i <= month2; ++i){
                res += getMonthMoney(year1,i);
            }
        }
        // 计算(减去) 不足一月的 (第一年第一个月 和 最后一年第一个月) 的利润
        res = getRes(year1, month1, day1, month2, day2, res);
        return res;
    }
    // 计算(减去) 不足一月的 (第一年第一个月 和 最后一年第一个月) 的利润
    public static int getRes(int year1, int month1, int day1, int month2, int day2, int res) {
        if (isPrimMonth(month1)) {
            res = res - (getMonthMoney(year1, month1) - day1);
        } else {
            res = res - (getMonthMoney(year1, month1) - 2 * day1);
        }
        if (isPrimMonth(month2)) {
            res = res - (getMonthMoney(year1, month2) - day2);
        } else {
            res = res - (getMonthMoney(year1, month2) - 2 * day2);
        }
        return res;
    }
}
