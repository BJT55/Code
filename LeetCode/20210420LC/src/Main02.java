import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Solution(n));
    }
    public static String Solution(int n){
        if(n == 0){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        while (n > 0){
            char c = num[(n%10)];
            res.append(c);
            n /= 10;
        }
        return res.toString();
    }
}
