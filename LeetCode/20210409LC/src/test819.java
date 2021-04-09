import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase() + ".";
        // 将被禁用的单词放入 set 中
        Set<String> ban = new HashSet<>();
        for (String word : banned){
            ban.add(word);
        }

        Map<String, Integer> map = new HashMap<>();
        String res = "";
        int maxCount = 0;
        StringBuilder word = new StringBuilder();
        for (char c : paragraph.toCharArray()){
            if (Character.isLetter(c)){
                // 如果是字母,将其填入word中
                word.append(c);
            }else if(word.length() > 0){
                // 遇到非字母符号,说明一个单词结束
                String wholeWord = word.toString();
                if (!ban.contains(wholeWord)){
                    // 判断这个单词是否为被禁用单词
                    map.put(wholeWord,map.getOrDefault(wholeWord,0)+1);
                    if (map.get(wholeWord) > maxCount){
                        res = wholeWord;
                        maxCount = map.get(wholeWord);
                    }
                }
                word = new StringBuilder();
            }
        }
        return res;
    }
}