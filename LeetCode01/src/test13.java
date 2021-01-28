//给定一个罗马数字，将其转换成整数。
//输入确保在 1 到 3999 的范围内
public class test13 {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        String s = "III";
        System.out.println(solution.romanToInt(s));
    }
}
class Solution13 {
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case 'I':
                    num += 1;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    num += 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    num += 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
            if (i != 0){
                if ( s.charAt(i - 1) == 'I' && ( s.charAt(i) == 'V' || s.charAt(i) == 'X' ))
                    num -= 2;
                if ( s.charAt(i - 1) == 'X' && ( s.charAt(i) == 'L' || s.charAt(i) == 'C' ))
                    num -= 20;
                if ( s.charAt(i - 1) == 'C' && ( s.charAt(i) == 'D' || s.charAt(i) == 'M' ))
                    num -= 200;
            }
        }
        return num;
    }
}