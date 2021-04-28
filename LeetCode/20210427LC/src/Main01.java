import java.util.Scanner;
// 根据输入的日期,计算是这一年的第几天
public class Main01 {
    public static int  year ,month, day;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        month = in.nextInt();
        day = in.nextInt();
        System.out.println(getOutDay());
    }

    public static int iConverDateToDay(int year, int month, int day) {
        if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31)
            return -1;
        // 判断闰年2月天数是否合格
        if (isLeapYear(year)){
            if (month == 2 && day > 29)
                return -1;
        }else {
            if (month == 2 && day > 28)
                return -1;
        }
        return 0;
    }

    public static int getOutDay(){
        int days = 0;
        if (iConverDateToDay(year, month, day) < 0){
            return -1;
        }
        int[] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        // 如果是闰年,则二月有29天
        if (isLeapYear(year)){
            monthDays[2] = 29;
        }
        // 计算前 month-1 个月的天数
        for (int i = 1; i < month; ++i){
            days += monthDays[i];
        }
        // 再加上 month 这个月天数
        return days+day;
    }

    public static boolean isLeapYear(int year){
        if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)){
            return true;
        }
        return false;
    }
}
