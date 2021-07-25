import java.util.HashSet;
import java.util.Set;

public class Solution38 {
    public String[] permutation(String s) {
        Set<String> list = new HashSet<>();
        char[] c = s.toCharArray();
        boolean[] visited = new boolean[s.length()];
        dfs(c,"",visited,list);
        return list.toArray(new String[0]);
    }

    private void dfs(char[] c, String s, boolean[] visited, Set<String> list) {
        if (s.length() == c.length){
            list.add(s);
            return;
        }

        for (int i = 0; i < c.length; i++) {
            if (visited[i]){
                continue;
            }
            visited[i] = true;
            dfs(c,s+c[i],visited,list);
            visited[i] = false;
        }
    }
}
