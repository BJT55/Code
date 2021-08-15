public class Solution20 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) return false;
        boolean isNum = false, isDot = false, isE = false;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') isNum = true;
            else if (c[i] == '.'){
                if (isDot || isE) return false;
                isDot = true;
            }
            else if (c[i] == 'e' || c[i] == 'E'){
                if (!isNum || isE) return false;
                isE = true;
                isNum = false;
            }
            else if (c[i] == '-' || c[i] == '+'){
                if (i != 0 && c[i-1] != 'e' && c[i-1] != 'E'){
                    return false;
                }
            }
            else return false;
        }
        return isNum;
    }
}
