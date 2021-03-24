class Solution14 {
    public int cuttingRope(int n) {
        if(n < 2)
            return 0;
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;

        int cutThree = n / 3;
        // 若每份为3最后剩余1，则将最后一份变为4
        if(n - cutThree*3 == 1)
            cutThree -= 1;

        int cutTwo = (n - cutThree*3)/2;
        return (int)Math.pow(3,cutThree) * (int)Math.pow(2,cutTwo);

    }
}