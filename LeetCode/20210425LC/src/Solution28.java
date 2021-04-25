class Solution28 {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0 && needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;
        if (needle.length() == 0)
            return 0;
        if (haystack.length() < needle.length())
            return -1;
        if (haystack.equals(needle))
            return 0;

        for(int i = 0; i <= haystack.length()-needle.length(); ++i){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(needle.length() == 1){
                    return i;
                }
                String tmp = haystack.substring(i,i+needle.length());
                if(tmp.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}