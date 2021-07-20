public class Solution20 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0){
            return false;
        }

        s = s.trim();
        boolean numFlag = false;
        boolean dotFlag = false;
        boolean eFlag = false;
        for (int i = 0; i < s.length(); i++) {
            // 判定为数字
            if (Character.isDigit(s.charAt(i))){
                numFlag = true;
            }
            // 判定为 '.'
            else if (s.charAt(i) == '.' && !dotFlag && !eFlag){
                dotFlag = true;
            }
            // 判定为 e
            else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && !eFlag && numFlag){
                eFlag = true;
                numFlag = false;
            }
            // 判定为 +- 符号
            else if ((s.charAt(i) == '+' || s.charAt(i) == '-') && (i == 0 || s.charAt(i-1) == 'e' || s.charAt(i-1) == 'E')){

            }else {
                return false;
            }
        }
        return numFlag;
    }
}
