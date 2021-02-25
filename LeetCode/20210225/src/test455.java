import java.util.Arrays;

public class test455 {

}

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int lenG = g.length;
        int lenS = s.length;
        int i = 0, j = 0;
        while(i < lenG && j < lenS){
            if(s[j] >= g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}