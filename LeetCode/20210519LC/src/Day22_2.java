import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day22_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            Map<Character,Integer> map = new HashMap<>();
            for (char c : str.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            boolean flag = false;
            for (char c : str.toCharArray()){
                if (map.get(c) == 1){
                    flag = true;
                    System.out.println(c);
                    break;
                }
            }
            if (!flag){
                System.out.println(-1);
            }
        }
    }
}
