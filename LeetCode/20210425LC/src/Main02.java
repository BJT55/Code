import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(Solution(n,m));
        }
    }

    private static int Solution(int n, int m) {
        if (n == m) return -1;
        int res = 0;
        for (int i = n; i <= m;){
            int step = stepNumber(i,m);
            if(step < 0) return -1;
            else if (i +step <= m){
                res++;
                i += step;
            }
            else break;
        }
        return res;
    }

    private static int stepNumber(int n, int m) {
        int res = -1;
        for (int i = 2; i < n; ++i){
            if(n%i == 0 && m%i == 0){
                res = Math.max(res,i);
            }
        }
        return res;
    }
}
