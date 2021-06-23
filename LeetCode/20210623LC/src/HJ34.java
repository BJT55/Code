import java.util.*;
public class HJ34{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.next();
            TreeMap<Character,Integer> map = new TreeMap<>();
            for(char c : s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            StringBuilder res = new StringBuilder();
            for(Character c : map.keySet()){
                int count = map.get(c);
                while(count-- > 0){
                    res.append(c);
                }
            }
            System.out.println(res.toString());
        }
    }
}