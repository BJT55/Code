class Solution58_2 {
    public String reverseLeftWords(String s, int n) {
        for(int i = 0; i < n; ++i){
            s += s.charAt(i);
        }
        char[] c = s.toCharArray();
        String res = "";
        for(int i = n; i < c.length; ++i){
            res += c[i];
        }
        return res;
    }
    public String reverseLeftWords02(String s, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length()));
        return res.toString();
    }
    public String reverseLeftWords03(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }
}