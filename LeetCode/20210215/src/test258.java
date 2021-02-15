public class test258 {

}

// 原理：
// X = 100*a + 10*b + c = 99*a + 9*b +(a+b+c)
/*
class Solution258 {
    public int addDigits(int num) {
        if(num > 9){
            num %= 9;
            if(num == 0) return 9;
        }
        return num;
    }
}*/

// 官方：
class Solution258 {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
