public class test434 {

}
class Solution434 {
    public int countSegments(String s) {
        int count  = 0;
        for(int i = 0; i < s.length(); ++i){
            if( (i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' '  ) count++;
        }
        return count;
    }
}