class Solution05 {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == ' '){
                res.append("%20");
                continue;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    // 库函数yyds
    public String replaceSpace02(String s){
        return s.replace(" ","%20");
    }
}