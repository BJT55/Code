import java.util.Scanner;

public class HJ63 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.next();
            int n = in.nextInt();
            int len = s.length();
            int[] preSum = new int[len+1];
            for(int i = 1; i <= len; ++i){
                preSum[i] = preSum[i-1];
                if(s.charAt(i-1) == 'C' || s.charAt(i-1) == 'G'){
                    preSum[i]++;
                }
            }
            int index = 0;
            int num = preSum[n];
            for(int i = n; i <= len; ++i){
                if(preSum[i] - preSum[i-n] > num){
                    index = i - n;
                    num = preSum[i] - preSum[i-n];
                }
            }
            System.out.println(s.substring(index,index+n));
        }
    }
}
