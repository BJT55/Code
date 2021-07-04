import java.util.*;
public class HJ107_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double num = in.nextDouble();
            boolean sign = num < 0;
            if (sign) {
                num = -num;
            }

            double distance = num;  // 误差
            double index = 0;
            double last = 0;
            while (true){
                last = index*index*index;
                if (last > num){
                    index -= distance;
                    distance /= 10;
                }
                if (distance < 0.01){
                    break;
                }
                index += distance;
            }

            double res = (int)((index+0.05)*10)/10.0;
            System.out.print( (sign) ? "-" : "");
            System.out.println(res);
        }
    }
}