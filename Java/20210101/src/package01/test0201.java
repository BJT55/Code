package package01;

public class test0201 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        date1.setDay(1998,1,17);
        date2.setDay(1999,3,13);
        System.out.println("张三的生日是："+date1.year+"年"+date1.month+"月"+date1.day+"日");
        System.out.println("李四的生日是："+date2.year+"年"+date2.month+"月"+date2.day+"日");
        System.out.println(date1.toString());
    }
}
