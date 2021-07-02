import java.util.*;
public class HJ96 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < s.length(); ++i){
                char start = s.charAt(i);
                if(Character.isDigit(start)){
                    res.append('*');
                    res.append(start);
                    int j = i+1;
                    for (; j < s.length(); j++) {
                        char end = s.charAt(j);
                        if (Character.isDigit(end)){
                            res.append(end);
                        }else {
                            res.append('*');
                            res.append(end);
                            break;
                        }
                    }
                    i = j;
                }else {
                    res.append(start);
                }
            }
            if (Character.isDigit(s.charAt(s.length()-1))){
                res.append('*');
            }
            System.out.println(res.toString());
        }
    }
}