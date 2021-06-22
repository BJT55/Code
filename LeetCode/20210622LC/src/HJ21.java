import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ21 {
    public static String letter = "abcdefghijklmnopqrstuvwxyz";
    public static String number = "22233344455566677778889999";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();

        while (in.hasNext()){
            String pw = in.next();
            StringBuilder res = new StringBuilder();
            for(char c : pw.toCharArray()){
                if(Character.isUpperCase(c)){
                    c = (char)(c+32);
                    if(c == 'z'){
                        c = 'a';
                    }else{
                        c += 1;
                    }
                }
                else if(Character.isLowerCase(c)){
                    for(int i = 0; i < 26; ++i){
                        if(c == letter.charAt(i)){
                            c = number.charAt(i);
                        }
                    }
                }
                res.append(c);
            }
            System.out.println(res.toString());
        }
    }
}
