public class test461 {

}

class Solution461 {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(x>0 || y>0){
            int xx = x&1;
            int yy = y&1;
            if((xx ^ yy) == 1) count++;
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
