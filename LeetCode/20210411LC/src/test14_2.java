class Solution {
    public int cuttingRope(int n) {
        if(n == 2 || n == 3){
            return n-1;
        }

        long three = 1;
        while(n>4){
            three *= 3;
            three %= 1000000007;
            n-=3;
        }
        return (int)((three*n)%1000000007);
    }
}