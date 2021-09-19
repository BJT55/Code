public class Solution372 {
    // (a * b) % k = (a % k)(b % k) % k
    public int superPow(int a, int[] b) {
        if (a == 1) return 1;
        if (a > 1337) {
            a %= 1337;
        }

        int key = 0;
        for (int i = 0; i < b.length; i++){
            key = (key*10 + b[i]) % 1140;
        }

        int res = 0;
        for (int i = 0; i < key-1; i++){
            res = res*a%1337;
        }
        return res;
    }
}
