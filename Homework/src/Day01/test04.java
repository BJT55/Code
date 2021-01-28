package Day01;
//将字符串中的大写字母转化成小写字母之后返回新得字符串
public class test04 {

    public static void main(String[] args) {
        String str = "shuYTgsUHjskY";
        Solution sl = new Solution();
        System.out.println(sl.toLowerCase(str));
    }

    //方法1
    static class Solution {
        public StringBuffer toLowerCase(String str) {
            StringBuffer s = new StringBuffer();
            if (s != null) {
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (Character.isUpperCase(c)) {
                        s.append(Character.toLowerCase(c));
                    }
                    else{
                        s.append(c);
                    }
                }
            }
            return s;
        }
    }

//    //方法2：
//    static class Solution {
//        public String toLowerCase(String str) {
//            String s = "";
//            if (str != null) {
//                for (int i = 0; i < str.length(); i++) {
//                    char c = str.charAt(i);
//                    if (Character.isUpperCase(c)) {
//                        c += 32;
//                    }
//                    s += c;
//                }
//            }
//            return s;
//        }
//    }
}
