import java.util.Scanner;

public class Day34_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long n = Long.parseLong(in.nextLine());
            StringBuilder res = new StringBuilder();
            while (n-- > 0){
                String name = in.nextLine();
                if (name.contains(" ") || name.contains(",")){
                    res.append("\""+name+"\"");
                }else {
                    res.append(name);
                }
                if (n != 0){
                    res.append(", ");
                }
            }
            System.out.println(res.toString());
        }
    }
}
