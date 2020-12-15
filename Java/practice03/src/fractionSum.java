public class fractionSum {
    //求1/1-1/2+1/3....+1/99-1/100的和
    public static double fraction(int n){
        double num = 1.0 / n;
        return num;
    }
    public static void main(String[] args) {
        int flag = -1;
        double sum = 0;
        for ( int i = 1; i <= 100; i++){
            flag *= -1;
            sum = sum + flag * fraction(i);
        }
        System.out.println("最终结果为："+sum);
    }
}
