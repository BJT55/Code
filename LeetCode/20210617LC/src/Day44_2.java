import java.util.Scanner;
// 单词倒排
public class Day44_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            char[] c = str.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (!Character.isLetter(c[i])){
                    c[i] = ' ';
                }
            }
            String str2 = new String(c);
            String[] s = str2.split(" ");
            StringBuilder res = new StringBuilder();
            for (int i = s.length-1; i >= 0 ; i--) {
                res.append(s[i] + " ");
            }
            System.out.println(res.toString().trim());
        }
    }
}
