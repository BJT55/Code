import java.util.*;
public class HJ5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            long res = 0;
            for(int i = 2; i < s.length(); ++i){
                char c = s.charAt(i);
                if(Character.isLetter(c)){
                    res = res * 16 + (int)(c-'A'+10);
                }else{
                    res = res * 16 + (int)(c - '1' +1);
                }
            }
            System.out.println(res);
        }
    }
}