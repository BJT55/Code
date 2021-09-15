import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            int amount = in.nextInt();
            String[] ss = s.split(", ");
            int[] num = new int[ss.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(ss[i]);
            }
            Set<Integer> set = new HashSet<>();
            for (int n : num){
                set.add(n);
            }
            int res = goodsCount(num,amount,set);
            System.out.println(res);
        }
    }

    private static int goodsCount(int[] num, int amount, Set<Integer> set) {
        Arrays.sort(num);
        int n = num.length;
        int min = Integer.MAX_VALUE;
        for (int i = n-1; i >= 0; i--){
            int count = amount/num[i];
            int tmp = count%num[i];
            if (tmp == 0){
                min = Math.min(count,min);
                continue;
            }
            for (int j = 0; j < i; j++){
                if (tmp%num[j] == 0){
                    min = Math.min(min,count+tmp/num[j]);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
