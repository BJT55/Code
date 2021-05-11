import java.util.Scanner;

public class Day20_2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] ss = str.split(" ");
        String a = ss[0];
        String b = ss[1];
        System.out.println(searchSameString(a,b));
    }
    public static int searchSameString(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        int res = 0;
        if (a.length() > b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }
        int start = 0, end = 0;  //记录相同字符串的起始和终止位置
        int i = 0, index = 0;  // i 为 a 的遍历位置, index 为 b 的遍历位置
        for (; i < a.length(); ++i){
            int tmp = i;
            while (tmp < a.length() && index < b.length()){
                char c = b.charAt(index);
                if (a.charAt(tmp) == c){
                    tmp++;
                    index++;
                    end++;
                }else {
                    res = Math.max(res,end-start);
                    index++;
                    start = tmp;
                    end = start;
                }
            }
        }

        return res;
    }
}