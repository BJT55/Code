public class Solution05 {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c == ' '){
                res.append("%20");
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public String replaceSpace02(String s) {
        return s.replace(" ","%20");
    }
}
