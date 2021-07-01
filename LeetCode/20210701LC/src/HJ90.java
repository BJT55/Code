import java.util.Scanner;
import java.util.stream.StreamSupport;

public class HJ90 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String ss = in.nextLine();
            String[] num = ss.split("\\.");
            boolean flag = true;
            a:for(int i = 0; i < num.length; ++i){
                int tmp = 0;
                for(int j = 0; j < num[i].length(); ++j){
                    if(Character.isDigit(num[i].charAt(j))){
                        tmp = tmp*10 + num[i].charAt(j)-'0';
                        if(tmp > 255){
                            System.out.println("NO");
                            flag = false;
                            break a;
                        }
                    }else {
                        System.out.println("NO");
                        flag = false;
                        break a;
                    }
                }
            }
            if(flag){
                System.out.println("YES");
            }
        }
    }
}
