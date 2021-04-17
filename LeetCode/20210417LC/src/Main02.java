public class Main02 {
    public static void main(String[] args) {
        String str = "   1a333";
        System.out.println(StrToInt(str));
    }
    public static int StrToInt(String str) {
        int res = 0,flag = 1;
        boolean sign = false;
        if(str.length() == 0){
            return res;
        }
        for (int i = 0; i < str.length(); ++i){
            if(Character.isDigit(str.charAt(i))){
                int num = str.charAt(i) - 48;
                res = res*10+num;
            }
            else if(str.charAt(i)==' '){
                continue;
            }
            else if (str.charAt(i) == '-'){
                if(sign){
                    return 0;
                }else {
                    flag = -1;
                    sign = true;
                }
            }
            else if(str.charAt(i) == '+') {
                if(sign){
                    return 0;
                }else {
                    flag = 1;
                    sign = true;
                }
            }
            else {
                return 0;
            }
        }
        return flag*res;
    }
}
