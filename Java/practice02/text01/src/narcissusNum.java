public class narcissusNum {
    //输出0～999之间的所有“水仙花数”

    public static  int power(int a,int n){
        //求a的n次方
        int pow = 1;
        for ( int i = 1; i <= n ;i++){
            pow *= a;
        }
        return pow;
    }

    public  static int num(int n){
        //求n的各位数字立方
        int sum = 0;
        while(n>0){
            sum += power(n % 10,3);
            n /= 10;
        }
        return sum;
    }

    public  static boolean numIsNarNum(int n) {
        //判断是否为水仙花数
        return num(n) == n;
    }
    public static void main(String[] args) {
        for( int i = 100; i <= 999; i++){      //水仙花数是一个三位数，从100开始
            if(numIsNarNum(i)){
                System.out.println(i+" ");
            }
        }
    }
}
