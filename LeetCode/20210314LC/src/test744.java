public class test744 {
}


class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; ++i){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }
}