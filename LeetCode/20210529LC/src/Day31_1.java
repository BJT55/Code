import java.util.Scanner;

public class Day31_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int year = in.nextInt();
            newYearDay(year);
            MartinLutherKingDay(year);
            presidentDay(year);
            memorialDay(year);
            independenceDay(year);
            laborDay(year);
            thanksGivingDay(year);
            christmasDay(year);
            System.out.println();
        }
    }
    // 根据 年-月-日 通过蔡勒公式计算当前星期几
    public static int todayWeek(int year, int month, int day){
        if(month == 1 || month == 2){
            month += 12;
            year -= 1;
        }
        int century = year / 100;
        year %= 100;
        int week = century / 4 - 2 * century + year + year / 4 + (13 * (month + 1)) / 5 + day - 1;
        week = (week % 7 + 7) % 7;
        if(week == 0){
            week = 7;
        }
        return week;
    }

    // 根据给定的年,月,第几周,星期几,计算该月的第几周的星期几是几号
    public static int festivalDay(int year, int month, int count, int date){
        // 计算该月1号是星期几
        int week = todayWeek(year,month,1);
        // 计算 第count周 的 星期date 是 day号
        int day = 1 + (count-1)*7 + (7-week+date)%7;
        return day;
    }

    // 1月1日：元旦
    public static void newYearDay(int year){
        System.out.println(year + "-01-01");
    }
    // 1月的第三个星期一：马丁·路德·金纪念日
    public static void MartinLutherKingDay(int year){
        int day = festivalDay(year,1,3,1);
        System.out.println(year + "-01-" + ( day < 10 ? "0"+day : day));
    }
    // 2月的第三个星期一：总统节
    public static void presidentDay(int year){
        int day = festivalDay(year,2,3,1);
        System.out.println(year + "-02-" + ( day < 10 ? "0"+day : day));
    }
    // 5月的最后一个星期一：阵亡将士纪念日
    public static void memorialDay(int year){
        // 从6月开始计算向前推
        // 计算6月1日是星期几
        int week = todayWeek(year,6,1);
        int day;
        if (week == 1){
            // 如果6月1日是星期一, 则5月的最后一个星期一为25号
            day = 25;
        }else {
            day = 31 - (week-2);
        }
        System.out.println(year + "-05-" + ( day < 10 ? "0"+day : day));
    }
    //  7月4日：美国国庆
    public static void independenceDay(int year){
        System.out.println(year + "-07-04");
    }
    // 9月的第一个星期一：劳动节
    public static void laborDay(int year){
        int day = festivalDay(year,9,1,1);
        System.out.println(year + "-09-" + ( day < 10 ? "0"+day : day));
    }
    // 11月的第四个星期四：感恩节
    public static void thanksGivingDay(int year){
        int day = festivalDay(year,11,4,4);
        System.out.println(year + "-11-" + ( day < 10 ? "0"+day : day));
    }
    // 12月25日：圣诞节
    public static void christmasDay(int year){
        System.out.println(year + "-12-25");
    }
}
