import java.util.Scanner;

public class Day27_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            long a = 0, b = 0, c = 0;
            String[] nums = s.split(" ");
            a = Long.parseLong(nums[0]);
            b = Long.parseLong(nums[1]);
            c = Long.parseLong(nums[2]);

            if (a + b > c && Math.abs(a-b) < c){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
