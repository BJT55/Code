//给定一个 haystack 字符串和一个 needle 字符串，
//在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

public class test28 {
    public static void main(String[] args) {
        Solution28 s = new Solution28();
        String haystack = "mississippi";
        String needle = "issip";
//        System.out.println(s.strStr(haystack,needle));
        System.out.println(haystack.indexOf(needle));
    }
}

class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            for (int j = 0; j < needle.length(); j++){
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
                if (j == needle.length() - 1)
                    return i;
            }
        }
        return  -1;
    }
}