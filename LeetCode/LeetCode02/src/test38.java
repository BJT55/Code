//给定一个正整数 n ，输出外观数列的第 n 项。
//「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
public class test38 {
    public static void main(String[] args) {
        Solution38 s = new Solution38();
        System.out.println(s.countAndSay(5));
    }
}

class Solution38 {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 2; i <= n; i++){
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < res.length(); j++){
                int count = 1;
                while ( j + 1 < res.length() && res.charAt(j) == res.charAt(j + 1)){
                    count++;
                    j++;
                }
                tmp.append(count);
                tmp.append(res.charAt(j));
            }
            res = tmp.toString();
        }
        return res;
    }
}