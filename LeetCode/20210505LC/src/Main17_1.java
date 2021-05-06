import java.util.Scanner;

public class Main17_1 {
    public static int res = -1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if (n == 1 || n == 2){
                System.out.println(-1);
            }else {
                int[] num = {1,1,1};
                System.out.println(solution(3,num,n));
            }
        }
    }
    public static int solution(int level,int[] num,int n){
        if (level > n){
            return res;
        }
        int pow = 1;
        // 计算第 level 层的数组
        int[] tmp = new int[2*level-1];
        for (int i = 0; i < tmp.length-1; ++i){
            if(i >= 2 && i < num.length){
                tmp[i] = num[i-1]+num[i-2]+num[i];
            }else if(i == 0){
                tmp[i] = 1;
            }else if (i == 1){
                tmp[i] = num[i-1]+num[i];
            }else {
                tmp[i] = tmp[i-2*pow];
                pow++;
            }
        }
        tmp[tmp.length-1] = 1;
        // 找到第一个偶数的位置
        for (int i = 0; i < tmp.length; i++){
            if (tmp[i] % 2 == 0){
                res = i+1;
                break;
            }
        }
        return solution(level+1,tmp,n);
    }
}
