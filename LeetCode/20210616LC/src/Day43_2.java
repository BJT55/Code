import java.util.ArrayList;
import java.util.Scanner;

public class Day43_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        while (in.hasNext()){
            n = in.nextInt();
            m = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int curSum = 0;
            getSum(arr,1,curSum,n,m);
        }
    }

    private static void getSum(ArrayList<Integer> arr, int pos, int curSum, int n, int dest) {
        if (curSum >= dest){
            if (curSum == dest){
                for (int i = 0; i < arr.size(); i++) {
                    System.out.println(arr.get(i) + " ");
                }
                System.out.println(arr.get(arr.size()-1));
            }
            return;
        }

        for (int i = pos; i <= n; i++) {
            arr.add(i);
            getSum(arr,i+1,curSum+i,n,dest);
            arr.remove(arr.size()-1);
        }
    }
}
