import java.util.Scanner;

public class Main17_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            String b = in.nextLine();
            System.out.println(solution(a,b));
        }
    }
    public static String solution(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        StringBuilder res = new StringBuilder();
        int carry = 0; // 记录是否进位
        while (len1 >= 0 || len2 >= 0)
        {
            if (len1 >= 0) {
                carry += a.charAt(len1) - '0';
            }
            if (len2 >= 0) {
                carry += b.charAt(len2) - '0';
            }

            res.append((char)(carry % 10 + '0'));
            carry /= 10;

            len1--;
            len2--;
        }

        if (carry == 1)
        {
            res.append('1');
        }
        return  res.reverse().toString();
    }
}
