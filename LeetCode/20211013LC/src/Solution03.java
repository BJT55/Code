
import java.util.Scanner;

public class Solution03 {
    public static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            int target = in.nextInt();
            s = s.replace("[",", ");
            s = s.replace("]",", ");
            String[] ss = s.split(", ");
            int[] num = new int[ss.length-1];
            for (int i = 1; i <= num.length; i++) {
                num[i-1] = Integer.parseInt(ss[i]);
            }
            count = 0;
            help(num,num.length-1,target,0);
            if (count == 0){
                System.out.println(-1);
            }else {
                System.out.println(count);
            }
        }
    }

    private static void help(int[] num, int i, int target, int sum) {
        if (target == sum){
            return;
        }
        if (i < 0 || i > num.length){
            return;
        }

        sum += num[i];
        if (sum > target){
            sum -= num[i];
            help(num, i-1, target, sum);
        }else {
            count++;
            help(num, i, target, sum);
        }
        return;
    }
}
