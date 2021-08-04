import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0){
            return res;
        }

        Map<Character,String> map = new HashMap<Character,String>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backTrack(res,map,digits,0,new StringBuilder());
        return res;
    }

    private void backTrack(List<String> res, Map<Character, String> map, String digits, int index, StringBuilder tmp) {
        if (index == digits.length()){
            res.add(tmp.toString());
        }else {
            char digit = digits.charAt(index);
            String letter = map.get(digit);
            int letterLen = letter.length();
            for (int i = 0; i < letterLen; i++) {
                tmp.append(letter.charAt(i));
                backTrack(res, map, digits, index+1, tmp);
                tmp.deleteCharAt(index);
            }
        }
    }
}
