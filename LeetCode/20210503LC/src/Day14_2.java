import java.util.Arrays;
import java.util.Scanner;

public class Day14_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; ++i){
                num[i] = in.nextInt();
            }
            Arrays.sort(num);
            int res = count(num,n,0,0,1);
            System.out.println(res);
        }
    }
    public static int count(int[] num, int n, int index, int sum, int multi){
        int count = 0;
        for (int i = index; i < n; ++i){
            sum += num[i];
            multi *= num[i];
            if (sum > multi){
                count = count + 1 + count(num,n,i+1,sum,multi);
            }else if (num[i] == 1){
                count = count + count(num,n,i+1,sum,multi);
            }else {
                break;
            }
            sum -= num[i];
            multi /= num[i];
            while (i<n-1 && num[i] == num[i+1]){
                i++;
            }
        }
        return count;
    }
}
