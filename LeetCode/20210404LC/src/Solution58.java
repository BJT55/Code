class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] ss = s.split(" ");
        for(int i = ss.length - 1; i >= 0; --i){
            if(!ss[i].equals(""))
                res.append(ss[i] + " ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        String s = "hello word this    a money";
        String[] ss = s.split(" ");
        for(String word : ss){
            System.out.print(word + ",");
        }
    }

}