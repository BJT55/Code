public class primeNum {
    //打印1到100的素数
    public static void main(String[] args) {
        int i , j;
        for (i = 1; i <= 100; i++){
            for (j = 2; j < i; j++){   //素数除1和他本身外不被其他数所整除
                if ( i % j == 0){
                    break;
                }
            }
            if ( i==j ){
                System.out.print(i+" ");
            }
        }
    }
}
