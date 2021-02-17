public class test290 {

}
/*
// 自己：击败 9.43%
class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        if(ss.length != pattern.length()) return false;
        for(int i = 0; i < pattern.length() - 1; ++i){
            int j = 0;
            while(j < pattern.length()){
                if(pattern.charAt(i) == pattern.charAt(j)){
                    if(!ss[i].equals(ss[j]) ){
                        return false;
                    }
                }else{
                    if(ss[i].equals(ss[j]) ){
                        return false;
                    }
                }
                j++;
            }
        }
        return true;
    }
}*/


class Solution290
{
    public boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        if (pattern.length() != ss.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.indexOf(pattern.charAt(i)) != elementSite(ss, ss[i]))
                return false;
        }
        return true;
    }

    private static int elementSite(String[] ss, String s) {
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals(s)) return i;
        }
        return -1;
    }
}