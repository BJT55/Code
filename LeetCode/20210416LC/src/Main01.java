import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String A = in.nextLine();
            String B = in.nextLine();
            System.out.println(Solution(A,B));
        }
    }
    public static int Solution(String a, String b){
        int count = 0;
        for (int i = 0; i < a.length(); ++i){
            StringBuilder tmp = new StringBuilder();
            tmp.append(a.substring(0,i));
            tmp.append(b);
            tmp.append(a.substring(i));
            if (help(tmp.toString())){
                count++;
            }
        }
        if(help(a+b)){
            count++;
        }
        return count;
    }
    public static boolean help(String a){
        StringBuilder res = new StringBuilder();
        res.append(a);
        String str = res.reverse().toString();
        if (a.equals(str))
            return true;
        return false;
    }
}
