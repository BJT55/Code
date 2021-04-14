import java.util.Scanner;

public class test0413_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
    public static String solution(String str){
        String res = "";
        String tmp = "";
        int max = 0,resMax = 0;
        for (int i = 0; i < str.length(); ++i){
            if(Character.isDigit(str.charAt(i))){
                tmp += str.charAt(i);
                max = tmp.length();
            }
            else {
                if(max >= resMax){
                    res = tmp;
                    resMax = res.length();
                }
                max = 0;
                tmp = "";
            }
        }
        if(max >= resMax){
            return tmp;
        }
        return res;
    }
}
