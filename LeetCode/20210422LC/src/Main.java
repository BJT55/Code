import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
//            byte n = in.nextByte();
            Byte n = in.nextByte();
            System.out.println(Solution(n));
        }

    }
    public static int Solution(byte n){
        int count = 0,tmp = 0;
        boolean flag = true;
        if (n < 0) {
            n = (byte) -n;
            flag = false;
        }
        while (n > 0){
            if ((n&1) == 1){
                tmp++;
            }else {
                count = Math.max(count,tmp);
                tmp = 0;
            }
            n >>>= 1;
        }
        count = Math.max(count,tmp);
        if (!flag) count += 1;
        return count;
    }
}
