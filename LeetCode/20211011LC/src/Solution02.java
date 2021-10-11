import java.util.ArrayList;
import java.util.List;

public class Solution02 {
    public static void main(String[] args) {
        String s = "This is 5th example";
        System.out.println(camelCase(s));
    }
    public static String camelCase(String newString) {
        // write code here
        StringBuilder res = new StringBuilder();
        List<String> list = new ArrayList<>();
        String tmp = "";
        for (char c : newString.toCharArray()){
            if (Character.isLetter(c) || Character.isDigit(c)){
                tmp += c;
            }else {
                if (!tmp.equals("")) {
                    list.add(tmp);
                }
                tmp = "";
            }
        }
        if (!tmp.equals("")){
            list.add(tmp);
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i == 0){
                res.append(s.toLowerCase());
            }else {
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (j == 0){
                        res.append(Character.toUpperCase(c));
                    }else {
                        res.append(Character.toLowerCase(c));
                    }
                }
            }
        }
        if (list.size() == 0){
            return "shopee";
        }
        return res.toString();
    }
}
