public class Solution97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int a = s1.length(), b = s2.length(), c = s3.length();

        if (a + b != c){
            return false;
        }

        boolean[] flag = new boolean[b+1];

        flag[0] = true;
        for (int i = 0; i <= a; ++i){
            for (int j = 0; j <= b; ++j){
                int p = i+j-1;
                if (i > 0){
                    flag[j] = flag[j] && s1.charAt(i-1) == s3.charAt(p);
                }
                if (j > 0){
                    flag[j] = flag[j] || (flag[j-1] && s2.charAt(j-1) == s3.charAt(p));
                }
            }
        }
        return flag[b];
    }
}
