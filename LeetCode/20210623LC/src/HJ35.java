import java.util.*;
public class HJ35 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] num = new int[n];
            num[0] = 1;
            int tmp = 2;
            for(int i = 1; i < n; ++i){
                num[i] = num[i-1] + tmp++;
            }
            triangle(num,1,n);
        }
    }
    public static void triangle(int[] num, int level, int n){
        if(level == 1){
            printArr(num,n);
        }
        while(n > 1){
            for(int i = 0; i < n-1; ++i){
                num[i] = num[i+1]-1;
            }
            n--;
            printArr(num,n);
        }
    }
    public static void printArr(int[] arr,int len){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < len; ++i){
            res.append(arr[i] + " ");
        }
        System.out.println(res.toString());
    }
}