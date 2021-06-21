import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HJ10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            Set<Character> set = new HashSet<>();
            int count = 0;
            for(char c : s.toCharArray()){
                if(!set.contains(c)){
                    count++;
                    set.add(c);
                }
            }
            System.out.println(count);
        }
    }
}
