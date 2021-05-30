import java.util.Scanner;

public class Day34_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            in.nextLine();
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < n; ++i){
                String name = in.nextLine();
                if(name.contains(",") || name.contains(" ")){
                    res.append("\"" + name + "\"");
                }else{
                    res.append(name);
                }
                if(i != n-1){
                    res.append(", ");
                }
            }
            System.out.println(res.toString());
        }
    }
}
