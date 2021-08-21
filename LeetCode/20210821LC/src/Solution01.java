import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String[] s = in.nextLine().split(" ");
            int n = in.nextInt();
            int[] num = new int[s.length];
            for (int i=0; i < s.length; i++){
                num[i] = Integer.parseInt(s[i]);
            }
            int res = 0;
            for (int i = 0; i < num.length; i++) {
                for (int j = i+1; j < num.length; j++) {
                    if (num[i]+num[j] < n){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}