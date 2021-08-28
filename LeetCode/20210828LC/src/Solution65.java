public class Solution65 {
    public int add(int a, int b) {
        while (b != 0){
            int carry = (a&b)<<1;
            a ^= b;
            b = carry;
        }
        return a;
    }
}
