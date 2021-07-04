public class Solution6_2 {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }

        StringBuilder res = new StringBuilder();
        int len = s.length();
        int cycleLen = 2*numRows-2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < len - i; j+=cycleLen) {
                res.append(s.charAt(j+i));
                if (i != 0 && i != numRows-1 && j + cycleLen - i < len){
                    res.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return res.toString();
    }
}