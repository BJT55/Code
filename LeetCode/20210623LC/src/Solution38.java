import java.util.HashSet;
import java.util.Set;

class Solution38 {
    public String[] permutation(String s) {
        Set<String > list = new HashSet<>();
        char[] c = s.toCharArray();
        boolean[] visited = new boolean[c.length];
        dfs(c,"",visited,list);
        return list.toArray(new String[0]);
    }

    private void dfs(char[] arr, String str, boolean[] visited, Set<String> list) {
        if (str.length() == arr.length){
            list.add(str);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]){
                continue;
            }
            visited[i] = true;
            dfs(arr, str+arr[i], visited, list);
            visited[i] = false;
        }

    }

}