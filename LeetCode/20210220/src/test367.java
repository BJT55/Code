public class test367 {
}

/*
// 自己： 1ms，17.96%
class Solution367 {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        for(int i = 2; i <= num / i; ++i){
            if(i * i == num)  return true;
        }
        return false;
    }
}
*/


// 官方：牛顿迭代法
class Solution367 {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long x = num / 2;
        while(x * x > num){
            x = (x + num / x) / 2;
        }
        return (x * x == num);
    }
}
