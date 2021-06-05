import java.util.Scanner;

public class Day42_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            StringBuilder res = new StringBuilder();
            for (char c : s.toCharArray()){
                if (Character.isDigit(c)){
                    res.append(c);
                }
            }
            System.out.println(res.toString());
        }
    }
}
