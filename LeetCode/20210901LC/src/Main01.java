import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String[] ss = s.split(" ");
            int[] nums = new int[ss.length];
            int len = 0;
            for (String n : ss){
                if (n != null){
                    nums[len++] = Integer.parseInt(n);
                }
            }

            System.out.println(findElem(nums));
        }
    }

    private static int findElem(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int n : nums){
            queue.add(n);
        }
        if (queue.size() >= 2){
            queue.poll();
        }else {
            return 0;
        }
        return queue.peek();
    }
}
