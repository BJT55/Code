import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day39_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.next();
            String s2 = in.next();
            int res = 0;
            Set<Character> set = new HashSet<>();
            for (char c : s1.toCharArray()){
                set.add(c);
            }
            for (char c : s2.toCharArray()){
                if (set.contains(c)){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
