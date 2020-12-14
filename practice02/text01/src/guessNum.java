import java.util.Random;
import java.util.Scanner;

public class guessNum {   //获得一个随机数
    public static  int getRanNum(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public static boolean guess(Scanner scanner,int toGuess){
        System.out.println("请输入要猜的数（1-100）：");
        int num = scanner.nextInt();
        if ( num < toGuess){
            System.out.println("小了...");
            return false;
        } else if ( num > toGuess){
            System.out.println("大了...");
            return false;
        } else {
            System.out.println("恭喜你，猜对了！！");
            return true;
        }
    }

    public static void startGame(Scanner scanner){
        int toGuess = getRanNum();
        while( true ){
            if (guess(scanner,toGuess)){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startGame(scanner);
    }
}
