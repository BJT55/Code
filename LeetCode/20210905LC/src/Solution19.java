public class Solution19 {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] f = new boolean[n+1][m+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j == 0){
                    // 空正则
                    f[i][j] = i == 0;
                }else {
                    // 非空正则 * / .
                    if (p.charAt(j-1) != '*'){
                        if (i > 0 && (s.charAt(i-1) == p.charAt(j-1) ||
                                p.charAt(j-1) == '.')){
                            f[i][j] = f[i-1][j-1];
                        }
                    }else {
                        // 有 * , 使用 , 不使用
                        if (j >= 2){
                            f[i][j] |= f[i][j-2];
                        }
                        if (i >= 1 && j >= 2 && (s.charAt(i-1) == p.charAt(j-2) ||
                                p.charAt(j-2) == '.')){
                            f[i][j] |= f[i-1][j];
                        }
                    }
                }
            }
        }
        return f[n][m];
    }
}
