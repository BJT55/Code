import java.util.Scanner;

public class HJ99 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(CalcAutomorphicNumbers(n));
        }
    }
    public static int CalcAutomorphicNumbers(int n){
        int count = 0;
        for(int i = 0; i <= n; ++i){
            int tmp = i;
            int j = 1;
            // 计算当前i的位数
            while ( tmp != 0){
                tmp = tmp/10;
                j = j*10;
            }
            if ((i*i-i)%j == 0){
                count++;
            }
        }
        return count;
    }
}
