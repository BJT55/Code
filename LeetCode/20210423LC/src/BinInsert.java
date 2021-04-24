import java.util.*;

public class BinInsert {
    public static int binInsert(int n, int m, int j, int i) {
        // write code here
        for (int t = 0; t < j; ++t){
            m <<= 1;
        }
        int tmp = 0;
        int num = 1;
        for (int t = 0 ; t <= i; ++t){
            if ((m&1) == 1) {
                tmp += num;
            }
            num *= 2;
            m>>=1;
        }
        return n+tmp;
    }

    public static void main(String[] args) {
        System.out.println(binInsert(1024,19,2,3));
    }
}