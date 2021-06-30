import java.util.*;
public class HJ67 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String[] strNum = in.nextLine().split(" ");
            int[] nums = new int[4];
            nums[0] = Integer.parseInt(strNum[0]);
            nums[1] = Integer.parseInt(strNum[1]);
            nums[2] = Integer.parseInt(strNum[2]);
            nums[3] = Integer.parseInt(strNum[3]);

            boolean isTwentyFour = false;
            for (int i = 0; i < 4; i++) {
                if (dfs(nums,1<<i,nums[i])){
                    isTwentyFour = true;
                    break;
                }else {
                    isTwentyFour = false;
                }
            }
            System.out.println(isTwentyFour);
        }
    }

    private static boolean dfs(int[] nums, int used, int val) {
        if (val == 24){
            return true;
        }

        // 7:0111,
        if (used == 7){
            return false;
        }

        for (int i = 0; i < 4; i++) {
            int tmp = 1<<i;
            if ((tmp&used) == 0){
                tmp |= used;
                if (dfs(nums,tmp,val+nums[i]) ||
                        dfs(nums, tmp, val-nums[i]) ||
                        dfs(nums, tmp, val*nums[i]) ||
                        (nums[i] != 0 && val%nums[i] == 0 && dfs(nums, tmp, val/nums[i]))){
                    return true;
                }
            }
        }
        return false;
    }
}