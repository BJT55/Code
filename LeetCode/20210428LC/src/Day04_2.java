import java.util.Scanner;

public class Day04_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        boolean flag = false;  // 不是负数
        String num = "0123456789ABCDEF";
        StringBuilder res = new StringBuilder();
        if (m < 0){
            flag = true;
            m = -m;
        }
        while (m > 0){
            res.append(num.charAt(m%n));
            m /= n;
        }
        if (flag){
            // 是负数
            res.append("-");
        }
        System.out.println(res.reverse());
    }
}
