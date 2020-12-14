import java.util.Scanner;

public class printX {
    //根据输入的数打印图形“X”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int up;    //上半部分行数
        int down;   //下半部分行数
        if (num % 2 != 0){    //判断奇数行还是偶数行
            up = 1 + num / 2;
            down = num - up;
            oddNum(up,down);
        }
        else{
            up = num / 2;
            down = num - up;
            evenNum(up,down);
        }
    }

    public static void oddNum (int up,int down) {    //奇数行图形

        for(int i = 1; i <= up; i++){  //打印上半部分
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 2 * (up - i) - 1; k > 0; k--){
                System.out.print(" ");
            }
            if ( i != up){
                System.out.print("*");   //末尾最右边的 “*”号
            }
            System.out.println();
        }

        for (int i = 1; i <= down; i++){   // 打印下半部分
            for (int j = down - i ; j > 0 ; j--){
                System.out.print(" ");
            }
            System.out.printf("*");
            for (int k = 1; k <= 2 * i - 1; k++ ){
                System.out.printf(" ");
            }
            System.out.println("*");

        }
    }

    public static void evenNum (int up,int down) {    //偶数行图形

        for(int i = 1; i <= up; i++) {  //打印上半部分
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 2 * (up - i); k > 0; k--){
                System.out.print(" ");
            }
            System.out.println("*");   //末尾最右边的 “*”号
        }

        for (int i = 1; i <= down; i++){   // 打印下半部分
            for (int j = down - i ; j > 0 ; j--){
                System.out.print(" ");
            }
            System.out.printf("*");
            for (int k = 2 * ( i - 1 ); k > 0 ; k--){
                System.out.printf(" ");
            }
            System.out.println("*");

        }
    }
}
