import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            Map<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
            }
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.get(c) == 1){
                    flag = true;
                    System.out.println(i);
                    break;
                }
            }
            if (!flag) System.out.println(-1);
        }
    }
}
