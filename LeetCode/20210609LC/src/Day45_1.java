import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day45_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String[] str = s.split(" ");
            String str1 = str[0];
            String str2 = str[1];
            Map<Character,Integer> map1 = new HashMap<>();
            Map<Character,Integer> map2 = new HashMap<>();
            for (char c : str1.toCharArray()) {
                map1.put(c,map1.getOrDefault(c,1)+1);
            }
            for (char c : str2.toCharArray()) {
                map2.put(c,map2.getOrDefault(c,1)+1);
            }
            int i;
            for (i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (map2.containsKey(c)){
                    if (map1.get(c) < map2.get(c)){
                        System.out.println("No");
                        break;
                    }
                }
            }
            if (i == str1.length()){
                System.out.println("Yes");
            }
        }
    }
}
