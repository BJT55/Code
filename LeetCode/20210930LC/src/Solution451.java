import java.util.*;

public class Solution451 {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2) - map.get(o1);
            }
        });

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char  c = list.get(i);
            int count = map.get(c);
            for (int j = 0; j < count; j++) {
                res.append(c);
            }
        }
        return res.toString();
    }
}
