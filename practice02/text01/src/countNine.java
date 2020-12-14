public class countNine {
    //求1到100中数字9的个数
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 100; i++ ){
            if ( i == 9 || ( i % 10) == 9 ){
                count++;
            }
            if( i / 10 == 9 ){
                count++;
            }
        }
        System.out.println("9出现的次数为："+count);
    }
}
