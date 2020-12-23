public class test03 {
    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static int fun(int a,int b){
        return a>b?a:b;
    }
    public static double fun(double a,double b){
        return a>b?a:b;
    }
    public static double fun(double a,double b,int c){
        double tmp = a>b?a:b;
        return tmp>c?tmp:c;
    }

    public static void main(String[] args) {
        int a = 5, b = 9;
        double x = 3.1, y = 9.3;
        double l = 2.6, m = 4.2;
        int n = 1;
        System.out.println(fun(a,b));
        System.out.println(fun(x,y));
        System.out.println(fun(l,m,n));
    }

}
