public class test557 {

}

/*
// 5ms
class Solution557 {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ss.length; ++i){
            sb.append(new StringBuilder(ss[i]).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}*/

// 8ms
class Solution557 {
    public String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        int len = s.length();
        int end = 0;
        while( end < len){
            int start = end;
            while(end < len && s.charAt(end) != ' '){
                end++;
            }
            for (int i = start; i < end; ++i){
                ret.append(s.charAt(start + end - 1 - i));
            }
            while (end < len && s.charAt(end) == ' '){
                end++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }
}