public class Day12_1 {
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        while(j > 0){
            m <<= 1;
            j--;
        }
        return n|m;
    }
}
