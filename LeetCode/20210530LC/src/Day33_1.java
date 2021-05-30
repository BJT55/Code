import java.util.Scanner;

public class Day33_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.next();
            String b = in.next();
            System.out.println(cut(a,b));
        }
    }
    public static int cut(String a, String b){
        int i = a.indexOf(b);
        if (i == -1){
            return 0;
        }
        return 1 + cut(a.substring(i+b.length()),b);
    }
}
