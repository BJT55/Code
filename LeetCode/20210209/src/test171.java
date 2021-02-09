//给定一个Excel表格中的列名称，返回其相应的列序号。
public class test171 {
    public static void main(String[] args) {
        String s = "AB";
        Solution171 solution171 = new Solution171();
        System.out.println(solution171.titleToNumber(s));
    }
}

class Solution171 {
    public int titleToNumber(String s) {
        int n = 0;
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            n = (int) (n + Math.pow(26,count)*(s.charAt(i) - 'A' + 1));
            count++;
        }
        return n;
    }
}