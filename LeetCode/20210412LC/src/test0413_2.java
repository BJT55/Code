import java.util.Scanner;
public class test0413_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }
    public static String solution(String s){
        String[] ss = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = ss.length-1; i >= 0; --i){
            res.append(ss[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}