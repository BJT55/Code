public class Solution02 {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++){
                char tmp = strs[j].charAt(i);
                if (c != tmp){
                    return res.toString();
                }
            }
            res.append(c);
        }
        return res.toString();
    }
}
