public class Solution58_1 {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = ss.length-1; i >= 0; i--){
            if (ss[i].length() != 0){
                res.append(ss[i]+" ");
            }
        }
        return res.toString().trim();
    }
}
