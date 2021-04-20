import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(Solution(n));
        }
    }
    public static int Solution(int n){
        Queue<Integer> queue = new LinkedList<>();
        int size = 2;
        for(int i = 0; i < n; ++i){
            queue.add(i);
        }
        int res = 0;
        while (!queue.isEmpty()){
            if(size>0){
                queue.add(queue.peek());
                queue.poll();
                size--;
            }else if(size == 0){
                res = queue.poll();
                size = 2;
            }
        }
        return res;
    }
}
