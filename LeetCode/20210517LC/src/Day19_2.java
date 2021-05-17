import java.util.Scanner;

public class Day19_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            String b = in.nextLine();
            if (a.length() < b.length()){
                System.out.println(getMaxSubstr(a,b));
            }else {
                System.out.println(getMaxSubstr(b,a));
            }
        }
    }
    public static String getMaxSubstr(String a, String b){
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        int len1 = c1.length;
        int len2 = c2.length;

        int start = 0, maxLen = 0;
        int[][] maxSub = new int[len1+1][len2+1];
        for (int i = 1; i <= len1; ++i){
            for (int j = 1; j <= len2; ++j){
                if (c1[i-1] == c2[j-1]){
                    maxSub[i][j] = maxSub[i-1][j-1] + 1;
                    if (maxLen < maxSub[i][j]){
                        maxLen = maxSub[i][j];
                        start = i - maxLen;
                    }
                }
            }
        }
        return a.substring(start,start+maxLen);
    }
}
