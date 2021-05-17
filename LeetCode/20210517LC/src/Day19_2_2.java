import java.util.Scanner;

public class Day19_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String min = s1.length() <= s2.length() ? s1 : s2;
            String max = s1.length() <= s2.length() ? s2 : s1;
            int len = 0;
            String res = "";
            for (int i = 0; i <= min.length(); ++i){
                for (int j = i+1; j <= min.length(); ++j){
                    if (max.contains(min.substring(i,j)) && j-i > len){
                        len = j - i;
                        res = min.substring(i,j);
                    }
                }
            }
            System.out.println(res);
        }
    }
}
