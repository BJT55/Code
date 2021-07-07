public class JZ2 {
    public String replaceSpace (String s) {
        // write code here
        /*int blankCount = 0;
        for(char c : s.toCharArray()){
            if (c == ' '){
                blankCount++;
            }
        }
        int[] arr = */
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if( c == ' '){
                res.append("%20");
            }
            res.append(c);
        }
        return res.toString();
    }
}
