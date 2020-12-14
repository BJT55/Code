public class leapYear {
    //打印1000到2000年的闰年
    public static void main(String[] args) {
        int year;
        for(year = 1000;year <= 2000;year++){
            if( ( ( year % 4 == 0 ) && ( year % 100 != 0) ) || year % 400 == 0 ){
                System.out.print(year+",");
            }
        }
    }
}
