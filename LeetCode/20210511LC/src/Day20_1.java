import java.util.Scanner;

public class Day20_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            StringBuilder res = new StringBuilder(s);
            System.out.println(res.reverse().toString());
        }
    }
}
