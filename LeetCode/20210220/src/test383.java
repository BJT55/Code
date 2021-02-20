import java.util.HashMap;
import java.util.Map;

public class test383 {

}
/*
// 自己： 14ms,20.85%
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); ++i){
            int count = map.getOrDefault(magazine.charAt(i),0)+1;
            map.put(magazine.charAt(i),count);
        }

        for(int i = 0; i < ransomNote.length(); ++i){
            char c = ransomNote.charAt(i);
            int count = map.getOrDefault(c,0);
            if(map.get(c) == null) return false;
            else {
                count--;
                map.put(c,count);
                if(count < 0) return false;
            }
        }
        return true;
    }
}
*/

// 1ms
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        int tmp[] = new int[26];
        for (char c : ransomNote.toCharArray()){
            int index = magazine.indexOf(c,tmp[c - 'a']);
            if(index == -1) return  false;
            tmp[c - 97] = index + 1;
        }
        return true;
    }
}
