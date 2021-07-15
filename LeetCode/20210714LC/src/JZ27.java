import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JZ27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str != null && str.length() > 0){
            permute(str.toCharArray(),0,res);
            Collections.sort(res);
        }
        return res;
    }
    private void permute(char[] c, int i, ArrayList<String> res){
        if (i == c.length-1){
            res.add(String.valueOf(c));
        }else {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < c.length; j++) {
                if (j == i || !set.contains(c[j])){
                    set.add(c[j]);
                    swap(c,i,j);
                    permute(c,i+1,res);
                    swap(c,j,i);
                }
            }
        }
    }

    private void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }

}
