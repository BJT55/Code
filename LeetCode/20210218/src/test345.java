public class test345 {

}

class Solution345 {
    public String reverseVowels(String s) {
        int left = 0,right = s.length() - 1;
        char[] sc = s.toCharArray();
        while(left < right){
            if(!isVowel(sc[left])) left++;
            if(!isVowel(sc[right])) right--;
            if(isVowel(sc[left])&&isVowel(sc[right])) {
                char tmp = sc[left];
                sc[left] = sc[right];
                sc[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(sc);
    }

    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return true;
        return false;
    }
}