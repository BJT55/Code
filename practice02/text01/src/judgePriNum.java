import java.util.Scanner;
public class judgePriNum {
    //判断输入的数是否为素数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int j;
        if ( num == 1 ){    //  1不是素数
            System.out.println(num+"不是素数..");
        }
        else{
            for (j = 2; j < num; j++){
                if ( num % j == 0){
                    System.out.println(num+"不是素数..");
                    break;
                }
            }
            if( j == num ){
                System.out.println(num+"是素数...");
            }
        }
    }
}
