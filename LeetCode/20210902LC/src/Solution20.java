public class Solution20 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) return false;

        s = s.trim();
        boolean isNum = false;
        boolean isDot = false;
        boolean isE = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                isNum = true;
            }
            else if (s.charAt(i) == '.' && !isDot && !isE){
                isDot = true;
            }
            else if ( (s.charAt(i) == 'e' || s.charAt(i) == 'E')
                    && !isE && isNum){
                isE = true;
                isNum = false;
            }
            else if ( (s.charAt(i) == '+' || s.charAt(i) == '-')
                    && (i == 0 || s.charAt(i-1) == 'e' || s.charAt(i-1) == 'E')){

            }
            else {
                return false;
            }
        }
        return isNum;
    }
}