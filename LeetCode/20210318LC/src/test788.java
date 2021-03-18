public class test788 {
    public static void main(String[] args) {
        Solution788 s = new Solution788();
        int N = 10;
        System.out.println(s.rotatedDigits(N));
    }
}

class Solution788 {
    public int rotatedDigits(int N) {
        int count = 0;
        for(int i = 1; i <= N; ++i){
            if(isGoodNumber(i))
                count++;
        }
        return count;
    }
    public boolean isGoodNumber(int n){
        boolean flag = false;
        while(n > 0){
            int tmp = n % 10;
            if(tmp == 3 || tmp == 4 || tmp == 7)
                return false;
            else if(tmp == 2 || tmp == 5 || tmp == 6 || tmp == 9)
                flag = true;
            n /= 10;
        }
        return flag;
    }
}