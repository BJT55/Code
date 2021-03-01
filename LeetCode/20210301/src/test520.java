public class test520 {
}

class Solution520 {
    public boolean detectCapitalUse(String word) {
        int upperNum = 0,index = 0;
        for(int i = 0; i < word.length(); ++i){
            if( Character.isUpperCase(word.charAt(i)) ){
                upperNum++;
                index = i;
            }
        }
        if(upperNum == word.length() || upperNum == 0 ) return true;
        if(upperNum == 1 && index == 0) return true;
        return false;
    }
}