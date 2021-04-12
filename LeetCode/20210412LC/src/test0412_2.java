import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test0412_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String delete = scanner.nextLine();
            System.out.println(solution(s,delete));
        }
    }
    public static String solution(String s, String delete){
        Set<Character> set = new HashSet<>();
        for(char c : delete.toCharArray()){
            set.add(c);
        }

        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                continue;
            }
            res.append(c);
        }
        return res.toString();
    }
}