import java.util.Scanner;

public class HJ107 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            double num = in.nextDouble();
            boolean sign = num < 0;
            if(sign){
                num = -num;
            }
            double left = 0.0, right = 150;
            while(right - left > 0.01){
                double mid = (right+left)/2;
                double tmp = mid*mid*mid;
                if(tmp > num){
                    right = mid;
                }else{
                    left = mid;
                }
            }
            System.out.print( (sign) ? "-" : "");
            System.out.printf("%.1f",left);
        }
    }
}
