public class Solution58_2 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < n+s.length(); i++){
            res.append(s.charAt(i%s.length()));
        }
        return res.toString();
    }
}
