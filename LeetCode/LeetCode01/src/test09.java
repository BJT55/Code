//判断一个整数是否是回文数。
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
// 不把整数转化为字符串解决
public class test09 {
    public static void main(String[] args) {
        int x = -121;
        Solution9 s = new Solution9();
        System.out.println(s.isPalindrome(x));
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {
        int num = 0;
        int temp = x;
        if (x < 0){
            return false;
        }
        while (x != 0){
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num == temp ? true : false;
    }
}
