import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            System.out.println(Solution(a,b,c,d));
        }
    }
    public static String Solution(int a, int b, int c, int d){
        String res = "";
        if(a+b == c-d && a+b+d == c){
            int B = (c-a)/2;
            int C = d-B;
            int A = a+B;
            res = String.valueOf(A)+" "+String.valueOf(B)+" "+String.valueOf(C);
        }else res = "No";

        return res;
    }
}
