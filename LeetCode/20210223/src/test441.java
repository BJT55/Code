public class test441 {

}

/*
// 自己：
class Solution441 {
    public int arrangeCoins(int n) {
        int i = 1;
        while(n > 0){
            n -= i;
            i++;
        }
        if(n == 0) return i - 1;
        return i - 2;
    }
}
*/

// 官方：
class Solution441 {
    public int arrangeCoins(int n) {
        int left = 1,right = n;
        long mid,sum;
        while (left <= right){
            mid = left + ( right - left)/2;
            sum = (mid+1)*mid/2;
            if(sum == n) return (int)mid;
            else if (n > sum) left = (int)mid+1;
            else if (n < sum) right = (int)mid-1;
        }
        return right;
    }
}