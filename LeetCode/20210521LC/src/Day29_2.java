import java.util.Scanner;

public class Day29_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int coins = in.nextInt();
            if (coins == 0){
                break;
            }
            int res = 1;
            if (coins == 1){
                System.out.println(0);
            }
            else if (coins == 2 || coins == 3){
                System.out.println(1);
            }
            else {
                while (coins > 3){
                    if (coins % 3 == 0){
                        coins /= 3;
                    }else {
                        coins = coins/3 + 1;
                    }
                    res++;
                }
                System.out.println(res);
            }
        }
    }
}
