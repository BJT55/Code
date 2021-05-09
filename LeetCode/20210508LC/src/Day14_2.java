import java.util.Arrays;
import java.util.Scanner;

public class Day14_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] bag = new int[n];
            for (int i = 0; i < n; ++i){
                bag[i] = in.nextInt();
            }
            Arrays.sort(bag);
            System.out.println(luckBag(bag,0,0,1));
        }
    }
    public static int luckBag(int[] bag,int index, int sum, int mutil){
        int count = 0;
        for (int i = index; i < bag.length; ++i){
            sum += bag[i];
            mutil *= bag[i];
            if (sum > mutil){
                count = count+1+luckBag(bag,i+1,sum,mutil);
            }else if ((bag[i] == 1)){
                count = count + luckBag(bag,i+1,sum,mutil);
            }else {
                break;
            }
            sum -= bag[i];
            mutil /= bag[i];
            while (i < bag.length-1 && bag[i] == bag[i+1]){
                i++;
            }
        }
        return count;
    }
}
