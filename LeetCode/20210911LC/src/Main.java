import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            int i = 0, j = 0, count = 1;
            StringBuilder res = new StringBuilder();
            for(; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }else{
                    res.append(s.charAt(i));
                    res.append(count);
                    count = 1;
                    i = j;
                }
            }
            if(res.toString().length() > s.length()){
                System.out.println(s);
            }else{
                System.out.println(res.toString());
            }

        }
    }
}