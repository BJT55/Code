class Solution44 {
    public int findNthDigit(int n) {
        int digit = 1;
        int start = 1;
        long count = 9;
        while (n > count){
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n-1) / digit;
        return Long.toString(num).charAt((n-1) % digit) - '0';
    }
}