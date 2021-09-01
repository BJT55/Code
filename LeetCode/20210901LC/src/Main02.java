import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countOne(n));
    }

    private static int countOne(int n) {
        int res = 0;
        for (int i= 1; i <= n; i++){
            int tmp = i;
            while (tmp > 0){
                if (tmp % 10 == 1){
                    res++;
                }
                tmp /= 10;
            }
        }
        return res;
    }
}
