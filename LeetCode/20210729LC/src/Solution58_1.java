public class Solution58_1 {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = word.length-1; i >= 0; --i){
            if(word[i].length() != 0){
                if(i != 0){
                    res.append(word[i] + " ");
                }else{
                    res.append(word[i]);
                }
            }
        }
        return res.toString().trim();
    }
}
