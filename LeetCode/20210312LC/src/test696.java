import java.util.ArrayList;
import java.util.List;

public class test696 {
}

/*
class Solution696 {
    public int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<>();
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == c){
                ++i;
                ++count;
            }
            counts.add(count);
        }
        int ret = 0;
        for (int j = 1; j < counts.size(); ++j){
            ret += Math.min(counts.get(j),counts.get(j-1));
        }
        return ret;
    }
}*/

class Solution696 {
    public int countBinarySubstrings(String s) {
        int index = 0, last = 0, ret = 0;
        while(index < s.length()){
            int count = 0;
            char c = s.charAt(index);
            while(index < s.length() && s.charAt(index) == c){
                index++;
                count++;
            }
            ret += Math.min(count,last);
            last = count;
        }
        return ret;
    }
}