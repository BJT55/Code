//给定一个正整数，返回它在 Excel 表中相对应的列名称
public class test168 {
    public static void main(String[] args) {
        int n = 52;
        Solution168 s = new Solution168();
        System.out.println(s.convertToTitle(n));
    }
}


// 此方法运行时间 0ms
class Solution168 {
    public String convertToTitle(int n) {
        if(n <= 0) return "";
        StringBuilder s = new StringBuilder();
        while(n > 0){
            n = n - 1;
            s.append((char)(n % 26 + 'A'));
            n /= 26;
        }
        return s.reverse().toString();
    }
}

/*

// 此方法运行时间 8ms
class Solution168 {
    public String convertToTitle(int n) {
        if(n <= 0) return "";
        String s = "";
        while(n > 0){
            n = n - 1;
            s = (char)(n % 26 + 'A') + s;
            n /= 26;
        }
        return s;
    }
}*/
