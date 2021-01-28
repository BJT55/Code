package Day03;
//判断一个整数是否是回文数
//回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
public class test05 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int num = 12321;
        System.out.println(sl.isPalindrome(num));
    }


    public static class Solution{
        public boolean isPalindrome(int x){
            String str = Integer.toString(x);
            int len = str.length();
            for (int i = 0; i <= len/2; i++){
                char c = str.charAt(i);
                for (int j = len - 1 - i; j >= len/2; j-- ){
                    char t = str.charAt(j);
                    if ( c == t ){
                        break;
                    }else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
