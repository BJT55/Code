import java.util.*;

class Solution49_2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            for (int i = 0; i < s.length(); ++i){
                count[s.charAt(i)-'a']++;
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < 26; ++i){
                if (count[i] != 0){
                    ans.append((char)('a'+i));
                    ans.append(count[i]);
                }
            }
            String key = ans.toString();
            List<String> list = map.getOrDefault(key,new ArrayList<>());
            list.add(s);
            map.put(key,list);
        }
        return new ArrayList<>(map.values());
    }
}