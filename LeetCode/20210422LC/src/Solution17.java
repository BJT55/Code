import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution17 {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0){
            return res;
        }

        Map<Character,String> map = new HashMap<Character, String>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }};
        backTrack(res,map,digits,0,new StringBuffer());
        return res;
    }
    public static void backTrack(List<String> res, Map<Character,String> map, String digits, int index, StringBuffer combination){
        if (index == digits.length()){
            res.add(combination.toString());
        }else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; ++i){
                combination.append(letters.charAt(i));
                backTrack(res,map,digits,index+1,combination);
                combination.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}