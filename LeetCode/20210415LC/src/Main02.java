import java.math.BigInteger;
import java.util.Scanner;

public class Main02{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long M = in.nextLong();
            long N = in.nextLong();
            System.out.println(Solution(M,N));
        }
    }
    public static String Solution(long M, long N){
        StringBuilder res = new StringBuilder();
        char[] num = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if(N < 2 || N > 16){
            if(N == 1){
                return String.valueOf(M);
            }else{
                return "";
            }
        }

        boolean flag = true;
        if(M < 0){
            M = -M;
            flag = false;
        }
        while(M > 0){
            long index = M%N;
            res.append(num[(int) index]);
            M /= N;
        }
        if(!flag){
            res.append("1");
        }
        return res.reverse().toString();
    }
}