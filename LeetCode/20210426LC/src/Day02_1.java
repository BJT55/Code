import java.util.Scanner;

public class Day02_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n+1];
        for (int i = 0; i < n; ++i){
            num[i] = in.nextInt();
        }
        int i = 0;
        int count = 0;
        while (i < n){
            if (num[i] < num[i+1]){
                while (i < n && num[i] <= num[i+1]){
                    i++;
                }
                count++;
                i++;
            }else if (num[i] == num[i+1]){
                i++;
            }else {
                while (i < n && num[i] > num[i+1]){
                    i++;
                }
                count++;
                i++;
            }
        }
        System.out.println(count);
    }

    public static int fun2(int[] num){
        int state = 0; // 0为初始状态,可以增可以减,1为增,-1为减
        int count = 1;
        for (int i = 1; i < num.length; ++i){
            if (num[i] > num[i-1]){
                if (state == 0){
                    state = 1;
                }
                if (state == -1){ //前面是减
                    state = 0;
                    count++;
                }
                continue;
            }
            if (num[i] < num[i-1]){
                if (state == 0){
                    state = -1;
                }
                if (state == 1){ // 前面是增
                    state = 0;
                    count++;
                }
                continue;
            }
        }
        return count;
    }
}
