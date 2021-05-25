import java.util.Scanner;

public class Day26_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            double n = Double.parseDouble(in.next());
            double r = Double.parseDouble(in.next());
            if(2 * r * 3.14 < n){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
