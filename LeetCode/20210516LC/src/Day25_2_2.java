import java.util.Scanner;

public class Day25_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.next();
            while (str.length() > 1){
                int res = 0;
                for (int i = 0; i < str.length(); ++i){
                    res += str.charAt(i)-'0';
                }
                str = String.valueOf(res);
            }
            System.out.println(str);
        }
    }
}
