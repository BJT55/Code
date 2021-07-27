public class Solution50 {
    public char firstUniqChar(String s) {
        int[] letter = new int[26];
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if(letter[c-'a'] == 0){
                letter[c-'a'] = 1;
            }else{
                letter[c-'a']++;
            }
        }

        for(int i = 0; i < s.length(); ++i){
            if(letter[s.charAt(i)-'a'] == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
