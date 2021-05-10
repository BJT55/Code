import java.util.Scanner;

public class Day19_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String res = "";
        int start = 0, end = 0;
        for (int i = 0; i < a.length(); ++i){
            char c1 = a.charAt(i);
            for (int j = 0; j < b.length(); ++j){
                char c2 = b.charAt(j);
                if (c1 == c2){
                    end = j;
                    break;
                }else {

                }
            }
        }
        System.out.println(res);
    }
}
