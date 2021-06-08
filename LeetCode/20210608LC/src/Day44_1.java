import java.util.Scanner;

public class Day44_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '_' && i+1 < s.length()){
                    res.append(Character.toUpperCase(s.charAt(i+1)));
                    i += 1;
                }else if (Character.isLetter(c)){
                    res.append(c);
                }
            }
            System.out.println(res.toString());
        }
    }
}
