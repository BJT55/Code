import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] rains = new int[1000];
        int len = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                rains[len++] = c-'0';
            }
        }

        int[] ans = new int[len];
        Arrays.fill(ans,0);

        for (int i = 0; i < len; i++){
            if (rains[i] > 0){
                ans[i] = -1;
                continue;
            }else if(rains[i] == -1){
                continue;
            }
            for (int j = i+1; j < len; j++){
                if (rains[j] > 0 ){
                    ans[i] = rains[j];
                    rains[j] = -1;
                    ans[j] = -1;
                    break;
                }
            }
        }

        StringBuilder res = new StringBuilder();
        res.append('[');
        for (int i = 0; i < ans.length; i++) {
            if (i != ans.length-1){
                res.append(ans[i]+",");
            }else {
                res.append(ans[i]);
            }
        }
        res.append(']');
        System.out.println(res.toString());

    }
}
