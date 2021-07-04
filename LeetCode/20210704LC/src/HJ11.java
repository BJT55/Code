import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = Integer.parseInt(in.next());
            StringBuilder res = new StringBuilder();
            while(n > 0){
                int num = n % 10;
                res.append(num);
                n /= 10;
            }
            System.out.println(res.toString());
        }
    }
}
