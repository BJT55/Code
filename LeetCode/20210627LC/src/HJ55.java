import java.util.*;
public class HJ55 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int res = 0;
            for(int i = 7; i <= n; i ++){
                if(String.valueOf(i).contains("7")){
                    res++;
                }else if(i % 7 == 0 ){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}