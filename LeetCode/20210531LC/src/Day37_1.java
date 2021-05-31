import java.util.Scanner;

public class Day37_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            in.nextLine();
            int res = 0, tmp = 0;
            for (int i = 0; i < n; ++i){
                String s = in.nextLine();
                if (s.contains("disconnect")){
                    res = Math.max(res,tmp);
                    tmp--;
                }else if (s.contains("connect")){
                    tmp++;
                }
            }
            System.out.println(res);
        }
    }
}
