public class Day09_1 {
    public int addAB(int A, int B) {
        // write code here
        while(B!=0){
            int tmp = A^B;
            B = (A&B)<<1;
            A = tmp;
        }
        return A;
    }
}
