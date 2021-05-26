import java.util.Scanner;

public class Day33_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String[] s = str.split(" ");
            String clothes = s[0];
            String cloth = s[1];
            int res = 0;
            int i = 0;
            while ( i <= clothes.length()-cloth.length()){
                if (cloth.equals(clothes.substring(i,i+cloth.length()))){
                    res++;
                    i += cloth.length();
                }else {
                    ++i;
                }
            }
            System.out.println(res);
        }
    }
}
