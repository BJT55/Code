public class Solution443 {
    public int compress(char[] chars) {
        int len = chars.length;
        int res = 0, left = 0;
        for (int i = 0; i < len; i++){
            if (i == len-1 || chars[i] != chars[i+1]){
                chars[res++] = chars[i];
                int num = i-left+1;
                if (num > 1){
                    int tmp = res;
                    while (num > 0){
                        chars[res++] = (char)(num%10 + '0');
                        num /= 10;
                    }
                    reverse(chars,tmp,res-1);
                }
                left = i+1;
            }
        }
        return res;
    }

    private void reverse(char[] chars, int left, int right) {
        while (left < right){
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
    }
}
