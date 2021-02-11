//编写一个算法来判断一个数 n 是不是快乐数。
//「快乐数」定义为：
//对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
//然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
//如果 可以变为  1，那么这个数就是快乐数。
//如果 n 是快乐数就返回 true ；不是，则返回 false 。
public class test202 {
    public static void main(String[] args) {

    }
}

class Solution202 {
    public int getNext(int n){
        int total = 0;
        while(n > 0){
            int d = n % 10;
            n = n / 10;
            total += d * d;
        }
        return total;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        // 倘若 fast 为1，则为快乐数，循环结束
        // 倘若 fast 等于 slow，则不是快乐数，循环结束
        while (fast != 1 && slow != fast){
            // 快慢指针
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
}