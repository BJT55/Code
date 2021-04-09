import java.util.HashMap;
import java.util.Map;

class Solution806 {
    public int[] numberOfLines(int[] widths, String s) {
        Map<Character, Integer> map = new HashMap<>();
        char c  = 'a';
        for(int num : widths){
            map.put(c,num);
            c += 1;
        }
        int sum = 0;
        int row = 1;
        for(int i = 0; i < s.length(); ++i){
            char letter = s.charAt(i);
            sum += map.get(letter);
            if(sum > 100){
                row++;
                sum = map.get(letter);
            }
        }
        return new int[]{row,sum};
    }
}