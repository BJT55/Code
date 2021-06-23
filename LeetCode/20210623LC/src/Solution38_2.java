import java.util.ArrayList;
import java.util.List;

public class Solution38_2 {
    public String[] permutation(String s) {
        List<String> list = new ArrayList<>();
        dfs(0,s.toCharArray(),list);
        return list.toArray(new String[list.size()]);
    }

    private void dfs(int index, char[] s, List<String> list) {
        if (index == s.length-1){
            list.add(new String(s));
            return;
        }

        for (int i = index; i < s.length; i++) {
            if (!canSwap(s,index,i)){
                continue;
            }
            swap(s,index,i);
            dfs(index+1, s, list);
            swap(s,index,i);
        }

    }

    private void swap(char[] s, int i, int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }

    private boolean canSwap(char[] s, int left, int right) {
        for (int i = left; i < right; i++) {
            if (s[i] == s[right]){
                return false;
            }
        }
        return true;
    }

}
