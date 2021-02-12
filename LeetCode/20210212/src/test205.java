//给定两个字符串 s 和 t，判断它们是否是同构的。
//如果 s 中的字符可以按某种映射关系替换得到 t ，
//那么这两个字符串是同构的。
//每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。
//不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，
//字符可以映射到自己本身。
public class test205 {
    public static void main(String[] args) {
        Solution205 solution = new Solution205();
        String s = "egg";
        String t = "add";
        System.out.println(solution.isIsomorphic(s,t));
    }
}

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        int[] sc = new int[256];
        int[] tc = new int[256];
        for(int i = 0; i < s.length(); ++i){
            if(sc[s.charAt(i)] != tc[t.charAt(i)]){
                return false;
            }
            sc[s.charAt(i)] = i + 1;
            tc[t.charAt(i)] = i + 1;
        }
        return true;
    }
}