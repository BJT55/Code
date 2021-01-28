package Day10;
// 8：
// 请你来实现一个 myAtoi(string s) 函数，
// 使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
public class test04 {
    public static void main(String[] args) {
        String str = "word and 987";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str){
        char[] c = str.toCharArray();
        int len = c.length;
        int index = 0;
        while ( index < len && c[index] == ' '){
            //去掉前面的空格
            index++;
        }
        while (!Character.isDigit(c[index])){
            index++;
        }
        if (index == len){
            //如果去掉前面空格和字母就到达末尾，则返回零
            return 0;
        }

        boolean flag = false;  // 判断符号位
        if (index != 0 && c[index - 1] == '-' ){
            flag = true;
        }

        int temp = 0;
        while ( index < len && Character.isDigit(c[index])){
            int digit = c[index] - '0';
            if ( temp > (Integer.MAX_VALUE - digit) / 10){
                // 判断是否越界
                return flag ? Integer.MIN_VALUE :Integer.MAX_VALUE;
            }
            temp = temp * 10 + digit;
            index++;
        }
        return flag == true ? -temp : temp;
    }
}
