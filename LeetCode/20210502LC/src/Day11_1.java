public class Day11_1 {
    public int getLCA(int a, int b) {
        // write code here
        if(a == b)
            return a;
        else if(a > b)
            a = a/2;
        else
            b = b/2;
        return getLCA(a,b);
    }
}
