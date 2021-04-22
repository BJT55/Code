class Solution14 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs.length == 0){
            return "";
        }
        //  找到字符串长度最小的
        int len = Integer.MAX_VALUE;
        for (String s : strs){
            len = Math.min(len,s.length());
        }

        a:for (int i = 0; i < len; ++i){
            int j = 1;
            for (; j < strs.length; ++j){
                if(strs[j].charAt(i) != strs[j-1].charAt(i)){
                    break a;
                }
            }
            res.append(strs[j-1].charAt(i));
        }
        return res.toString();
    }


    public String longestCommonPrefix02(String[] strs) {
        if (strs.length == 0) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; ++i){
            while (strs[i].indexOf(res) != 0){
                res = res.substring(0,res.length()-1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}