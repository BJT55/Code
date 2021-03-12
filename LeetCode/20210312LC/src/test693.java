public class test693 {
}

class Solution693 {
    public boolean hasAlternatingBits(int n) {
        while(n > 0){
            int tmp1 = n & 1;
            n >>= 1;

            int tmp2 = n & 1;
            if(tmp1 == tmp2)
                return false;
        }
        return true;
    }
}