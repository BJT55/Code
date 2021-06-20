import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HJ9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            Set<Integer> set = new HashSet<>();
            int res = 0;
            while(n != 0){
                int num = n % 10;
                if(!set.contains(num)){
                    set.add(num);
                    res = res*10 + num;
                }
                n /= 10;
            }
            System.out.println(res);
        }
    }
}
