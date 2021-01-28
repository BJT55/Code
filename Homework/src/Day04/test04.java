package Day04;
//给定一个仅包含大小写字母和空格' '的字符，返回其最后一个单词的长度，如果不存在最后一个单词，请返回零
public class test04 {
    public static void main(String[] args) {
        String str1 = "I like swimming";
        String str2 = "I have an apple ";

        System.out.println(lengthOfLastWord(str1));
        System.out.println(lengthOfLastWord(str2));
    }

    public static int lengthOfLastWord(String s){
        int temp = 0;
        int length = 0;
        char c = ' ';
        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if ( (c != ' ') && (i != s.length() - 1)){
                temp++;
            }else {
                if ( i == s.length() - 1){
                    temp++;
                }
                length = temp;
                temp = 0;  //遇到空格重新计算单词长度
            }
        }
        if ( c == ' '){  //最后一位字符如果是 ' '
            return 0;
        }else {
            return length;
        }
    }
}
