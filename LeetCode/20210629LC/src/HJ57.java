import java.util.*;

public class HJ57 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.next();
            String s2 = in.next();
            StringBuilder res = new StringBuilder();
            int i = s1.length()-1;
            int j = s2.length()-1;
            int carry = 0;
            while(i >= 0 && j >= 0){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(j);
                int num = c1 - '0' + c2 - '0';
                num += carry;
                if(num >= 10){
                    carry = 1;
                }else{
                    carry = 0;
                }
                res.append(num%10);
                i--;
                j--;
            }
            while(i >= 0){
                int num = s1.charAt(i)-'0';
                num += carry;
                if(num >= 10){
                    carry = 1;
                }else{
                    carry = 0;
                }
                res.append(num%10);
                i--;
            }

            while(j >= 0){
                int num = s2.charAt(j)-'0';
                num += carry;
                if(num >= 10){
                    carry = 1;
                }else{
                    carry = 0;
                }
                res.append(num%10);
                j--;
            }
            if(carry == 1){
                // 最后还有一位进位
                res.append(1);
            }
            System.out.println(res.reverse().toString());
        }
    }
}
