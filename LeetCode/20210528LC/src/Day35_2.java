import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day35_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String name = in.nextLine();
            Set<String> set = new HashSet<>();
            int start = 0;
            while (start<str.length()){
                if (Character.isLetter(str.charAt(start)) || str.charAt(start) == '\"'){
                    break;
                }
                start++;
            }
            for (int i = start; i < str.length(); ++i){
                if (str.charAt(i) == '\"' && start != i){
                    set.add(str.substring(start+1,i));
                    start = i+1;
                }
                else if (str.charAt(start) != '\"' && str.charAt(i) == ','){
                    set.add(str.substring(start,i));
                    start = i+1;
                }
            }
            if (start < str.length() && Character.isLetter(str.charAt(start)) && Character.isLetter(str.charAt(str.length()-1))){
                set.add(str.substring(start));
            }
            if (set.contains(name)){
                System.out.println("Ignore");
            }else {
                System.out.println("Important!");
            }
        }
    }
}
