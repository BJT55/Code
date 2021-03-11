public class test680 {
}

class Solution680 {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isTrue(s,i,j-1) || isTrue(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isTrue(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}