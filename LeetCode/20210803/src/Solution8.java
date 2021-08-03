import org.omg.CORBA.INTERNAL;

public class Solution8 {
    public int myAtoi(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int index = 0;
        while (index < n && c[index] == ' '){
            // 去掉前面空格
            index++;
        }
        if (index == n){
            return 0;
        }

        boolean sign = false;
        if (c[index] == '-'){
            // 判断正负
            sign = true;
            index++;
        }
        else if (c[index] == '+'){
            index++;
        }
        else if (!Character.isDigit(c[index])){
            return 0;
        }

        int res = 0;
        while (index < n && Character.isDigit(c[index])){
            int digit = c[index] - '0';
            if (res > (Integer.MAX_VALUE-digit)/10){
                return sign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res*10 + digit;
            index++;
        }
        return sign ? -res : res;
    }
}
