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
            boolean flag = false; //是否存在只出现一次的字符
            for (char c : str.toCharArray()){
                if (map.get(c) == 1){
                    System.out.println(c);
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(-1);
            }
        }
    }
}
