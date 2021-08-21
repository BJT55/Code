import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String[] s = in.nextLine().split(" ");
            int[] num = new int[s.length];
            for (int i=0; i < s.length; i++){
                num[i] = Integer.parseInt(s[i]);
            }
            int res = 1;
            int paper = 1;
            for (int i = 1; i < num.length; i++){
                if (num[i] > num[i-1]){
                    paper++;
                }else {
                    paper = 1;
                }
                res += paper;
            }
            System.out.println(res);
        }
    }
}