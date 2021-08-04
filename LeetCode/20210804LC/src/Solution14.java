public class Solution14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int len = Integer.MAX_VALUE; //记录strs数组中最短str
        for (int i = 0; i < strs.length; i++) {
            len = Math.min(len,strs[i].length());
        }

        a:for (int i = 0; i < len; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[j-1].charAt(i)){
                    break a;
                }
            }
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}
