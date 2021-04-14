public class test19 {
    public boolean isMatch(String A, String B) {
        int n = A.length();
        int m = B.length();
        boolean[][] f = new boolean[n+1][m+1];

        for (int i = 0; i <= n; ++i){
            for (int j = 0; j <= m; ++j){
                if (j == 0){
                    f[i][j] = i == 0;
                }else {
                    if (B.charAt(j-1) != '*'){
                        if (i > 0 && (A.charAt(i-1) == B.charAt(j-1) || B.charAt(j-1) == '.')){
                            f[i][j] = f[i-1][j-1];
                        }
                    }else{
                        if(j >= 2){
                            f[i][j] |= f[i][j-2];
                        }
                        if (i >= 1 && j >= 2 && (A.charAt(i-1) == B.charAt(j-2) || B.charAt(j-2) == '.')){
                            f[i][j] |= f[i-1][j];
                        }
                    }
                }
            }
        }
        return f[n][m];
    }


    public boolean isMatch02(String A, String B) {
        if (A.length() == 0){
            // 如果正则串长度为奇数，必定不匹配，比如 "."、"ab*",必须是 a*b*这种形式，*在奇数位上
            if (B.length()%2 != 0 )
                return false;
            int i = 1;
            while (i < B.length()){
                if (B.charAt(i) != '*')
                    return false;
                i += 2;
            }
            return true;
        }
        if (B.length() == 0){
            return false;
        }
        // c1,c2 两个串的当前位置
        // c3正则串当前位置的后一位
        char c1 = A.charAt(0),c2 = B.charAt(0),c3 = 'a';
        if (B.length() > 1){
            c3 = B.charAt(1);
        }

        if (c3 != '*'){
            if (c1 == c2 || c2 == '.'){
                return isMatch02(A.substring(1),B.substring(1));
            }else {
                return false;
            }
        }else{
            if (c1 == c2 || c2 == '.'){
                return isMatch02(A.substring(1),B) || isMatch02(A,B.substring(2));
            }else {
                return isMatch02(A,B.substring(2));
            }
        }
    }
}
