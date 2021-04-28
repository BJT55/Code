import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(findNumberOf1(num));
    }
    public static int findNumberOf1(int num){
        int count = 0;
        if(num < 0){
            count = 1;
            num = -num;
        }

        while (num > 0){
            if ((num&1) == 1)
                count++;
            num >>>= 1;
        }
        return count;
    }
}
