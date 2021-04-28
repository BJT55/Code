import java.util.Arrays;
import java.util.Scanner;

// 幸运的袋子
public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; ++i){
            num[i] = in.nextInt();
        }
        System.out.println(luckBag(n,num));
    }
    public static int luckBag(int n, int[] num){
        int count = 0;
        Arrays.sort(num);
        for (int i = num.length-1; i >= 1; --i){
            if (i+1 < num.length && num[i+1] == num[i]){
                // 去掉重复球判断
                continue;
            }
            for (int j = i; j >= 1; --j){
                if (j+1 < num.length && num[j+1] == num[j] && j != num.length-2){
                    continue;
                }
                if (add(num,0,j) > mul(num,0,j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int add(int[] num, int head, int tail){
        int sum = 0;
        for (int i = head; i <= tail; i++){
            sum += num[i];
        }
        return sum;
    }
    public static int mul(int[] num, int head, int tail){
        int sum = 1;
        for (int i = head; i <= tail; i++){
            sum *= num[i];
        }
        return sum;
    }
}
