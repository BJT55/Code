public class test20 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0)
            return  false;

        boolean isNum = false, isDot = false, isE = false;
        char[] str = s.trim().toCharArray();
        for (int i = 0; i < str.length; ++i){
            if (str[i] >= '0' && str[i] <= '9')
                isNum = true;
            else if(str[i] == '.'){
                if (isDot || isE){
                    // 小数点前没有小数点或e
                    return false;
                }
                isDot = true;
            }
            else if (str[i] == 'e' || str[i] == 'E'){
                if (!isNum || isE){
                    // e/E 之前必须有整数,且不能出现重复e/E
                    return false;
                }
                isE = true;
                isNum = false; // 重置
            }
            else if (str[i] == '-' || str[i] == '+'){
                if (i != 0 && str[i-1] != 'e' && str[i-1] != 'E')
                    return false;
            }
            else
                return false;
        }
        return isNum;
    }
}
