public class Day15_1 {
    public int addAB(int A, int B) {
        // write code here
        while (A > 0){
            int tmp = A^B;
            A = (A&B)<<1;
            B = tmp;
        }
        return B;
    }
}
