public class Solution400 {
    public int findNthDigit(int n) {
        long len = 1, tmp = 1;
        long num = n;
        while (num > 9*tmp*len){
            num -= 9*num*len;
            len++;
            tmp *= 10;
        }
        int cur = (int)(tmp+(tmp-1)/len);
        return ((cur+" ").charAt((int)((num-1)%len))-'0');
    }
}
