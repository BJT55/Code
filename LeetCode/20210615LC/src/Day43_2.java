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
        // 判断当前和是否大于等于dest
        if (curSum >= dest){
            if (curSum == dest){
                for (int i = 0; i < arr.size() - 1; i++) {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println(arr.get(arr.size()-1));
            }
            return;
        }

        // 继续类加
        for (int i = pos; i <= n; i++) {
            // 保存当前数据
            arr.add(i);
            getSum(arr,i+1,curSum+i,n,dest);
            // 尝试类加其他数据, 删除当前数据
            arr.remove(arr.size()-1);
        }
    }
}
