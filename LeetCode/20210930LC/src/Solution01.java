import java.util.HashMap;
import java.util.Map;

public class Solution01 {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aacecaaa"));
    }
    public static String shortestPalindrome (String s) {
        // write code here
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!map.isEmpty()){
                if (map.containsKey(c)) {
                    if (map.size() == 1 && map.get(c) == 1){
                        left.append(c);
                        break;
                    }
                    if (map.get(c)%2 != 0){
                        int tmp = (map.get(c)+1)/2;
                        while (tmp-- > 0){
                            left.append(c);
                            right.append(c);
                        }
                    }else {
                        int tmp = map.get(c)/2;
                        while (tmp-- > 0) {
                            left.append(c);
                            right.append(c);
                        }
                    }
                    map.remove(c);
                }
            }else {
                break;
            }
        }
        String a = left.toString();
        String b = right.reverse().toString();
        return a+b;
    }
}
