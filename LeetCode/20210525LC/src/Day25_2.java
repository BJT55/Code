import java.util.Scanner;

public class Day25_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String res = in.next();
            while (res.length() > 1){
                int num = 0;
                for (int i = 0; i < res.length(); ++i){
                    num += res.charAt(i)-'0';
                }
                res = String.valueOf(num);
            }
            System.out.println(res);
        }
    }
}
