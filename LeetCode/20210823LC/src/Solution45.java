import java.util.Arrays;

public class Solution45 {
    public String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        StringBuilder res = new StringBuilder();
        Arrays.sort(str, (x,y)->(x+y).compareTo(y+x));
        for (String s : str){
            res.append(s);
        }
        return res.toString();
    }
}