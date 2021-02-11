import java.util.Arrays;

// 统计所有小于非负整数 n 的质数的数量
public class test204 {
    public static void main(String[] args) {
        Solution204 s = new Solution204();
        int n = 3;
        System.out.println(s.countPrimes(n));
    }
}
// 超时
// 若判断质数时 if 中 改为 i*i<=n 则可以通过
// 但此时运行时间为 700ms
class Solution204 {
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 0; i < n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        if(n == 2) return true;
        for(int i = 2; i < n; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
/*

class Solution204{
    public int countPrimes(int n){
        // 创建数组，用来存放n个数是否为质数（0：不是，1：是）
        int[] isPrime = new int[n];
        // 将数组中所有元素的值设为1
        Arrays.fill(isPrime,1);
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i] == 1){ //是质数
                count++;
                if((long) i * i < n){
                    for(int j = 2; j * i < n; j++){
                        isPrime[j * i] = 0;
                    }
                }
            }
        }
        return count;
    }
}*/
