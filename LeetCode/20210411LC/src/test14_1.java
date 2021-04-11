class Solution14_1 {
    public int cuttingRope(int n) {
        if(n <= 3)
            return n-1;
        int three = n / 3;
        if(n % 3 == 1){
            three--;
        }else if(n % 3 == 0)
            return (int)(Math.pow(3,three));
        return (int)(Math.pow(3,three) * (n - 3*three));
    }
}