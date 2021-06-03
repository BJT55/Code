import java.util.ArrayList;
import java.util.List;

class Solution131 {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        dfs(s,0,new ArrayList<String>(),list);
        return list;
    }
    public void dfs(String s, int start, ArrayList<String> path, List<List<String>> list){
        if (start == s.length()){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < s.length(); ++i){
            String s1 = s.substring(start,i+1);
            if (isPalindrome(s1)){
                // 是回文串
                path.add(s1);
                dfs(s,i+1,path,list);
                path.remove(path.size()-1);
            }
        }
    }
    // 判断是否为回文字符串
    public boolean isPalindrome(String s){
        if (s == null || s.length() <= 1){
            return true;
        }
        int left = 0, right = s.length()-1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}