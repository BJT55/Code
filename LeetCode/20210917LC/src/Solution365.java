public class Solution365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x+y < z)
            return false;

        if (x == 0 || y == 0)
            return z == 0 || x+y == z;

        return z% gcd(x,y) == 0;
    }

    private int gcd(int x, int y) {
        int tmp = x%y;
        while (tmp != 0){
            x = y;
            y = tmp;
            tmp = x%y;
        }
        return y;
    }

}
