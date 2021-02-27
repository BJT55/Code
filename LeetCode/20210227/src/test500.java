import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test500 {

}

/*
class Solution500 {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList<>();
        for (String word : words){
            int n1 = 0, n2 = 0, n3 = 0, len = word.length();
            for (int i = 0; i < len; ++i){
                if (s1.contains(word.charAt(i)+"")) n1++;
                else if(s2.contains(word.charAt(i)+"")) n2++;
                else n3++;
            }
            if (n1 == len || n2 == len || n3 == len) list.add(word);
        }
        return list.toArray(new String[list.size()]);
    }
}
*/

class Solution500 {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        String s[] = {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        // 将字符对应的第几排标号放入hashmap中
        for (int i = 0; i < s.length;++i){
            for (int j = 0; j < s[i].length(); j++){
                map.put(s[i].charAt(j),i);
            }
        }

        //开始遍历
        for (String word : words){
            // 记录当前单词的首个字母所处键盘字母的第几行
            int first = map.get(word.charAt(0));
            int i = 0;
            for (; i < word.length(); ++i){
                if (!(map.get(word.charAt(i)) == first)) break;
            }
            // 若不满足（所在同一行）则直接跳出循环，因此下面语句不能被执行到
            if (i == word.length()){
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
