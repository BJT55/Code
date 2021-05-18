import java.util.Scanner;

public class Day26_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Double a = Double.parseDouble(in.next());
            Double b = Double.parseDouble(in.next());
            catIntoTheBowl(a,b);
        }
    }
    public static void catIntoTheBowl(double n, double r){
        if (n <= 2*r*3.14){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
