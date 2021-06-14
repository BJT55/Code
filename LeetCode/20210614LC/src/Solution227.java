import java.util.Stack;

class Solution227 {
    public int calculate(String s) {
        int res = 0, digit = 0;
        char sign = '+';
        Stack<Integer> nums = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0'){
                digit = digit*10 + c - '0';
            }
            if ((c < '0' && c != ' ') || i == s.length()-1){
                if (sign == '+'){
                    nums.push(digit);
                }else if (sign == '-'){
                    nums.push(-digit);
                }else if (sign == '*' || sign == '/'){
                    int tmp = sign == '*' ? nums.peek() * digit : nums.peek() / digit;
                    nums.pop();
                    nums.push(tmp);
                }
                sign = c;
                digit = 0;
            }
        }
        for (; !nums.isEmpty(); nums.pop()) {
            res += nums.pop();
        }
        return res;
    }
}