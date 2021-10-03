public class Solution476 {
    public int findComplement(int num) {
        int tmp = num, c = 0;
        while (tmp > 0){
            tmp >>= 1;
            c = (c<<1)+1;
        }
        return num^c;
    }
}
