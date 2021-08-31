import java.util.HashMap;
import java.util.Scanner;

public class Solution1 {
    // 输出出现次数最多的单词和次数
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String article = in.nextLine();
        // 对于文章标点符号处理
        for (char c : article.toCharArray()){
            if (!Character.isLetter(c)){
                article.replace(c,' ');
            }
        }
        // 单词分割
        String[] words = article.split(" ");

        String res = ""; // 记录最多出现的单词
        int max = 0; // 记录最多出现的次数
        // 存储单词并记录数据
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : words){
            if (word != null){
                map.put(word,map.getOrDefault(word,0)+1);
            }
            if (map.get(word) > max){
                res = word;
                max = map.get(word);
            }
        }

        System.out.println("出现次数最多的单词 : " + res);
        System.out.println("出现的次数 : " + max);
    }
}
