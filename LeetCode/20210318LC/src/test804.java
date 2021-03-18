import java.util.HashSet;
import java.util.Set;

public class test804 {
}


class Solution804 {
    private static String[] code = {
            ".-","-...","-.-.","-..",".",
            "..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",
            ".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--",
            "--.."
    };
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(String word : words){
            StringBuilder s = new StringBuilder();
            for(char c : word.toCharArray()){
                s.append(code[c - 'a']);
            }
            set.add(s.toString());
        }
        return set.size();
    }
}