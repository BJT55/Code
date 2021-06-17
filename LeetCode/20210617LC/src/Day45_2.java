import java.util.Arrays;
import java.util.Scanner;

public class Day45_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String[] str = in.nextLine().split(" ");
            int n = Integer.parseInt(str[0]);
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = str[i+1];
            }
            String destStr = str[n+1];
            int k = Integer.parseInt(str[n+2]);

            Arrays.sort(args);
            int count = 0;
            String resStr = "";

            for (String s: arr) {
                if (isBrother(s.toCharArray(),destStr.toCharArray())){
                    // 判断是否为兄弟单词, 判断是否为第k个兄弟单词
                    count++;
                    if (count == k){
                        resStr = s;
                    }
                }
            }
            System.out.println(count);
            if (count >= k) {
                System.out.println(resStr);
            }
        }
    }

    public static boolean isBrother(char[] str1, char[] str2) {
        if (str1.length != str2.length){
            return false;
        }

        String A = new String(str1);
        String B = new String(str2);
        if (A.equals(B)){
            // 相同不是兄弟单词
            return false;
        }
        // 排序后判断是否相等
        Arrays.sort(str1);
        Arrays.sort(str2);
        A = new String(str1);
        B = new String(str2);
        return A.equals(B);
    }
}
