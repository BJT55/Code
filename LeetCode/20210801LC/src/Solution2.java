import java.util.Scanner;

public class Solution2 {
    private static double res;
    private static double tmp;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] nums = new int[100000];
        int index = 0;
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                nums[index++] = c-'0';
            }
        }

        int len = index;
        int k = nums[len-1];
        tmp = 0.0;
        for (int i = 0 ; i < len-k; i++){
            avg(nums,i,i+k,tmp);
        }

        System.out.println(res);
    }

    private static void avg(int[] nums, int start, int end, double tmp) {
        double sum = 0;
        for (int i = start; i < end; i++){
            sum += nums[i];
        }
        double ptmp;
        if (tmp != 0){
           ptmp = (sum/(end-start)-tmp)/tmp;
        }else {
            ptmp = sum/(end-start);
        }
        res = Math.max(res,ptmp);
    }
}
