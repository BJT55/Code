public class JZ2 {
    public String replaceSpace (String s) {
        // write code here
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if( c == ' '){
                res.append("%20");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
