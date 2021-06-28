import java.util.Stack;

class Solution394 {
    public String decodeString(String s) {
        StringBuffer res = new StringBuffer();
        Stack<Integer> multiStack = new Stack<>();
        Stack<StringBuffer> strStack = new Stack<>();
        int multi = 0;
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                multi = multi*10 + c - '0';
            }
            else if (c == '['){
                strStack.add(res);
                multiStack.add(multi);
                res = new StringBuffer();
                multi = 0;
            }
        }
    }
}