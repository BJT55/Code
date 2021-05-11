import java.util.Scanner;

public class Day21_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = Integer.parseInt(in.nextLine());
            String s = in.nextLine();
            operateMP3(n,s);
        }
    }
    public static void operateMP3(int n, String s) {
        int i = 1;
        int[] res = new int[s.length()];
        int index = res.length-1;
        for (char c : s.toCharArray()) {
            if (c == 'U') {
                if (i == 1) {
                    i = n;
                    res[index--] = i;
                } else {
                    i -= 1;
                    res[index--] = i;
                }
            } else if (c == 'D') {
                if (i == n) {
                    i = 1;
                    res[index--] = i;
                } else {
                    i += 1;
                    res[index--] = i;
                }
            }
        }

        for (int m = 0; i < res.length; ++m){
            if (m == 0){
                System.out.println(res[m]);
            }else {
                System.out.println(" "+res[m]);
            }
        }
        System.out.println();
        System.out.println(i);
    }
}
