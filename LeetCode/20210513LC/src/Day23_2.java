import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day23_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            String b = in.nextLine();
            if (a.length() < b.length()){
                swap(a,b);
            }
            Map<Character,Integer> mapA = new HashMap<>();
            Map<Character,Integer> mapB = new HashMap<>();
            for (char c : a.toCharArray()){
                mapA.put(c,mapA.getOrDefault(c,0)+1);
            }
            for (char c : b.toCharArray()){
                mapB.put(c,mapB.getOrDefault(c,0)+1);
            }

            int res = 0;
            for (int i = 0; i < a.length(); ++i) {
                char c = a.charAt(i);
                if (mapA.containsKey(c) && mapB.containsKey(c)) {
                    if (mapA.get(c) != mapB.get(c)) {
                        res += Math.abs(mapA.get(c) - mapB.get(c));
                        mapA.put(c,0);
                        mapB.put(c,0);
                    }
                }else {
                    if (mapA.containsKey(c)){
                        res += mapA.get(c);
                    }else {
                        res += mapB.get(c);
                    }
                }
            }
            System.out.println(res);
        }
    }
    public static void swap(String a, String b){
        String tmp = a;
        a = b;
        b = tmp;
    }
}
