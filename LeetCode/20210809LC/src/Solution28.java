public class Solution28 {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (needle.length() > haystack.length()) return -1;
        if (needle.equals(haystack)) return 0;
        for (int i = 0; i < haystack.length()-len; i++){
            String tmp = haystack.substring(i,i+len);
            if (needle.equals(tmp)){
                return i;
            }
        }
        return -1;
    }
}
